import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Player extends Character {
    private final int level;
    private AttackStrategy strategy; // [cite: 31]
    private final List<Skill> skills = new ArrayList<>(); // [cite: 23]
    private final Random random = new Random();

    public Player(String name, int hp, int ap, int level, AttackStrategy strategy) {
        super(name, hp, ap);
        if (level < 1) {
            throw new IllegalArgumentException("Level must be positive.");
        }
        this.level = level;
        setStrategy(strategy);
    }
    
    public int getLevel() { return level; }

    public final void setStrategy(AttackStrategy s) {
        if (s == null) {
            throw new IllegalArgumentException("AttackStrategy cannot be null.");
        }
        this.strategy = s;
    }

    public void addSkill(Skill s) {
        if (s != null) {
            this.skills.add(s);
        }
    }
    
    public List<Skill> getSkills() {
        return Collections.unmodifiableList(skills); // Immutable reference [cite: 23]
    }

    @Override
    public void attack(Character target) {
        // Cek apakah ada HealSkill untuk digunakan? (Contoh Implementasi)
        if (getHealth() < getMaxHealth() * 0.5) {
            for (Skill s : skills) {
                if (s instanceof HealSkill) {
                    System.out.printf("Player uses %s -> ", s.name());
                    s.apply(this, target);
                    return; // Menggunakan skill alih-alih menyerang
                }
            }
        }
        
        // Serangan Normal menggunakan Strategy
        int baseDamage = strategy.computeDamage(this, target);
        int finalDamage = baseDamage;
        
        // Cek dan gunakan Piercing Strike secara acak [cite: 22, 23]
        List<Skill> piercingSkills = skills.stream()
                .filter(s -> s instanceof PiercingStrikeSkill)
                .toList();

        if (!piercingSkills.isEmpty()) {
            // Gunakan salah satu secara acak [cite: 23]
            PiercingStrikeSkill pStrike = (PiercingStrikeSkill) piercingSkills.get(random.nextInt(piercingSkills.size()));
            double multiplier = pStrike.getMultiplier();
            
            finalDamage = (int) (baseDamage * multiplier);
            
            // Log penggunaan skill [cite: 23]
            System.out.printf("Player attacks (Strategy: %d) + %s (x%.1f) -> %d dmg", 
                              baseDamage, pStrike.name(), multiplier, finalDamage);
        } else {
            System.out.printf("Player attacks (Strategy: %d) -> %d dmg", baseDamage, finalDamage);
        }
        
        target.takeDamage(finalDamage);
    }
    
    @Override
    public String toString() {
        return String.format("Player(name=%s, HP=%d/%d, AP=%d, Lv=%d)", 
                             getName(), getHealth(), getMaxHealth(), getAttackPower(), level);
    }
}