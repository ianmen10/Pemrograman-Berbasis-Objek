public class RegenEffect implements StatusEffect {
    private final int perTurn;
    private int duration;

    public RegenEffect(int perTurn, int duration) {
        this.perTurn = perTurn;
        this.duration = duration;
    }

    @Override
    public String name() {
        return "Regen (+" + perTurn + " HP, " + duration + " turns)";
    }

    @Override
    public void onTurnStart(Character self) {
        // Tidak ada aksi di awal giliran
    }

    @Override
    public void onTurnEnd(Character self) {
        if (isExpired()) return;
        
        int oldHealth = self.getHealth();
        self.heal(perTurn);
        duration--;
        System.out.printf("  [Regen] %s heals for %d HP. HP: %d -> %d. Remaining: %d turns\n", 
                          self.getName(), perTurn, oldHealth, self.getHealth(), duration);
    }

    @Override
    public boolean isExpired() {
        return duration <= 0;
    }
}