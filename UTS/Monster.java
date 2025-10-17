import java.util.Random;

public class Monster extends Enemy {
    private final Random random = new Random();

    public Monster(String name, int hp, int ap, int threatLevel, AttackStrategy strategy) {
        super(name, hp, ap, threatLevel, strategy);
    }

    @Override
    public void attack(Character target) {
        // Damage dihitung menggunakan strategy [cite: 31]
        int baseDamage = strategy.computeDamage(this, target);
        
        // Randomisasi damage (misalnya 90% - 110%) [cite: 17]
        int minDamage = (int) (baseDamage * 0.9);
        int maxDamage = (int) (baseDamage * 1.1);
        int finalDamage = random.nextInt(maxDamage - minDamage + 1) + minDamage;

        System.out.printf("Monster attacks (Base: %d, Final: %d dmg)", baseDamage, finalDamage);
        target.takeDamage(finalDamage);
    }
    
    @Override
    public String toString() {
        return String.format("Monster(name=%s, HP=%d/%d, AP=%d, Threat=%d)", 
                             getName(), getHealth(), getMaxHealth(), getAttackPower(), getThreatLevel());
    }
}