public class HealSkill implements Skill {
    private final int amount;

    public HealSkill(int amount) {
        this.amount = Math.max(0, amount);
    }

    @Override
    public String name() {
        return "HealSkill (+" + amount + " HP)";
    }

    @Override
    public void apply(Character self, Character target) {
        // Hanya memulihkan diri sendiri (self) [cite: 21]
        int oldHealth = self.getHealth();
        self.heal(amount);
        System.out.printf("%s heals for %d HP. HP: %d -> %d\n", self.getName(), amount, oldHealth, self.getHealth());
    }
}