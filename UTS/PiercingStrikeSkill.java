public class PiercingStrikeSkill implements Skill {
    private final double multiplier; // Contoh: 1.2

    public PiercingStrikeSkill(double multiplier) {
        this.multiplier = multiplier;
    }

    @Override
    public String name() {
        return "PiercingStrike (x" + multiplier + ")";
    }

    @Override
    public void apply(Character self, Character target) {
        // Skill ini diterapkan langsung di Player.attack()
        // Tidak ada aksi langsung di sini
    }
    
    public double getMultiplier() {
        return multiplier;
    }
}