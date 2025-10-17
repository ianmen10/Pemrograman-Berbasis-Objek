public class LevelScaledStrategy implements AttackStrategy {
    private final int bonusPerLevel;

    public LevelScaledStrategy(int bonusPerLevel) {
        this.bonusPerLevel = bonusPerLevel;
    }

    @Override
    public int computeDamage(Character self, Character target) {
        int baseDamage = self.getAttackPower();
        
        if (self instanceof Player player) {
            // Tambah bonus per level [cite: 30]
            baseDamage += player.getLevel() * bonusPerLevel;
        }
        
        return baseDamage;
    }
    
    @Override
    public String toString() {
        return String.format("LevelScaledStrategy (+%d/level)", bonusPerLevel);
    }
}