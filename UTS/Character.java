import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public abstract class Character {
    private final String name;
    protected final int maxHealth; // Digunakan untuk validasi HealSkill [cite: 37]
    private int health;
    private final int attackPower;
    
    // Status Effects [cite: 27]
    private final List<StatusEffect> effects = new ArrayList<>();

    protected Character(String name, int health, int attackPower) {
        if (health <= 0 || attackPower < 0) { // Validasi health > 0 dan attackPower >= 0 [cite: 10, 11]
            throw new IllegalArgumentException("Health must be positive, and Attack Power must be non-negative.");
        }
        this.name = name;
        this.maxHealth = health;
        this.health = health;
        this.attackPower = attackPower;
    }

    // --- Getters ---
    public final String getName() { return name; }
    public final int getAttackPower() { return attackPower; }
    public final int getHealth() { return health; }
    public final int getMaxHealth() { return maxHealth; }
    public final List<StatusEffect> getEffects() { return List.copyOf(effects); } // Immutable reference [cite: 23]
    
    // --- Setters dengan Validasi ---
    protected final void setHealth(int value) {
        if (value < 0) { // Validasi dan mencegah nilai negatif [cite: 41]
            this.health = 0;
        } else if (value > maxHealth) { // Validasi tidak melebihi maxHealth [cite: 37]
            this.health = maxHealth;
        } else {
            this.health = value;
        }
    }

    // --- Hooks & Core Methods ---
    
    // Hook untuk efek seperti Shield [cite: 26, 54]
    protected int onIncomingDamage(int baseDamage) {
        int damage = baseDamage;
        int damageReduction = 0;

        // Cek efek Shield aktif [cite: 26, 39]
        for (StatusEffect effect : effects) {
            if (effect instanceof ShieldEffect) {
                damageReduction += ((ShieldEffect) effect).getFlatReduce();
            }
        }
        
        int finalDamage = Math.max(0, damage - damageReduction);
        
        if (damageReduction > 0) {
            System.out.printf(" (Shield absorbs %d dmg)", damageReduction);
        }
        
        return finalDamage;
    }

    public final void takeDamage(int dmg) {
        int finalDamage = onIncomingDamage(dmg);
        setHealth(getHealth() - finalDamage);
    }
    
    public final void heal(int amount) {
        setHealth(getHealth() + amount);
    }

    // Mencegah override [cite: 13]
    public final boolean isAlive() { return health > 0; } 
    
    public final void addEffect(StatusEffect e) {
        if (e != null) {
            System.out.printf("  %s gains %s\n", name, e.name());
            this.effects.add(e);
        }
    }

    // Melaksanakan giliran [cite: 14, 27]
    public final void performTurn(Character target) {
        if (!isAlive()) return;

        System.out.printf("  [Start Turn] %s (HP: %d/%d, AP: %d)\n", name, health, maxHealth, attackPower);

        // 1. Panggil onTurnStart dan hapus efek kadaluarsa
        Iterator<StatusEffect> iterator = effects.iterator();
        while (iterator.hasNext()) {
            StatusEffect e = iterator.next();
            e.onTurnStart(this);
            if (e.isExpired()) {
                System.out.printf("  [Effect Expired] %s: %s\n", name, e.name());
                iterator.remove();
            }
        }

        // 2. Panggil abstract attack [cite: 14]
        if (target != null && target.isAlive()) {
            System.out.printf("  %s attacks %s -> ", name, target.getName());
            attack(target);
            System.out.println("  " + target.getName() + " HP: " + target.getHealth() + "/" + target.getMaxHealth());
        }

        // 3. Panggil onTurnEnd dan hapus efek kadaluarsa
        iterator = effects.iterator();
        while (iterator.hasNext()) {
            StatusEffect e = iterator.next();
            e.onTurnEnd(this);
            if (e.isExpired()) {
                System.out.printf("  [Effect Expired] %s: %s\n", name, e.name());
                iterator.remove();
            }
        }
    }

    // Metode yang wajib diimplementasikan oleh subclass [cite: 12]
    public abstract void attack(Character target);
}