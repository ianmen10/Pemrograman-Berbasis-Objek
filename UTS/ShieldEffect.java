public class ShieldEffect implements StatusEffect {
    private final int flatReduce;
    private int duration;

    public ShieldEffect(int flatReduce, int duration) {
        this.flatReduce = flatReduce;
        this.duration = duration;
    }

    public int getFlatReduce() { return flatReduce; }

    @Override
    public String name() {
        return "Shield (-" + flatReduce + " dmg, " + duration + " turns)";
    }
    
    // Shield diterapkan di hook Character.onIncomingDamage.
    
    @Override
    public void onTurnStart(Character self) {
        // Tidak ada aksi di awal giliran
    }

    @Override
    public void onTurnEnd(Character self) {
        duration--;
        System.out.printf("  [Shield] Remaining: %d turns\n", duration);
    }

    @Override
    public boolean isExpired() {
        return duration <= 0;
    }
}