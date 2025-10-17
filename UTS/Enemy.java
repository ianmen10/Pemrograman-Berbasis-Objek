public abstract class Enemy extends Character {
    private int threatLevel; // 1..5 [cite: 16]
    protected AttackStrategy strategy; // [cite: 31]

    protected Enemy(String name, int hp, int ap, int threatLevel, AttackStrategy strategy) {
        super(name, hp, ap);
        if (threatLevel < 1 || threatLevel > 5) { // Validasi threatLevel [cite: 16]
            throw new IllegalArgumentException("Threat Level must be between 1 and 5.");
        }
        this.threatLevel = threatLevel;
        setStrategy(strategy);
    }

    public final int getThreatLevel() { return threatLevel; }

    public final void setStrategy(AttackStrategy s) {
        if (s == null) {
            throw new IllegalArgumentException("AttackStrategy cannot be null.");
        }
        this.strategy = s;
    }
}