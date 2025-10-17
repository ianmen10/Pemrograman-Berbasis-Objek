public class BossMonster extends Enemy {
    private int turnCounter = 0; // State internal untuk Rage Strike [cite: 18]

    public BossMonster(String name, int hp, int ap, int threatLevel, AttackStrategy strategy) {
        super(name, hp, ap, threatLevel, strategy);
    }

    @Override
    public void attack(Character target) {
        turnCounter++; // Hitung giliran

        boolean isLowHealth = getHealth() < (getMaxHealth() * 0.5);
        boolean isThirdTurn = (turnCounter % 3 == 0);
        
        // Cek Rage Strike trigger 
        if (isLowHealth || isThirdTurn) {
            // Rage Strike: 2x damage [cite: 18]
            int baseDamage = strategy.computeDamage(this, target);
            int rageDamage = (int) (baseDamage * 2.0);
            
            String trigger = isLowHealth ? "HP < 50%" : "3rd turn";
            System.out.printf("Boss attacks (RAGE STRIKE: %s) -> %d dmg", trigger, rageDamage);
            target.takeDamage(rageDamage);
        } else {
            // Serangan normal
            int damage = strategy.computeDamage(this, target);
            System.out.printf("Boss attacks (Normal) -> %d dmg", damage);
            target.takeDamage(damage);
        }
    }
    
    @Override
    public String toString() {
        return String.format("BossMonster(name=%s, HP=%d/%d, AP=%d, Threat=%d)", 
                             getName(), getHealth(), getMaxHealth(), getAttackPower(), getThreatLevel());
    }
}