import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Battle {
    private final List<Character> teamA;
    private final List<Character> teamB;
    private int turn = 0;

    public Battle(List<Character> teamA, List<Character> teamB) {
        this.teamA = teamA.stream().filter(Character::isAlive).collect(Collectors.toList());
        this.teamB = teamB.stream().filter(Character::isAlive).collect(Collectors.toList());
    }
    
    private boolean isTeamADefeated() {
        return teamA.stream().noneMatch(Character::isAlive);
    }

    private boolean isTeamBDefeated() {
        return teamB.stream().noneMatch(Character::isAlive);
    }

    private Character findTarget(Character attacker, List<Character> defenders) {
        List<Character> aliveDefenders = defenders.stream().filter(Character::isAlive).toList();
        if (aliveDefenders.isEmpty()) return null;

        if (attacker instanceof Player) {
            // Player target: Enemy dengan threatLevel tertinggi, lalu HP terendah [cite: 34]
            return aliveDefenders.stream()
                .filter(c -> c instanceof Enemy)
                .map(c -> (Enemy) c)
                .max(Comparator
                    .<Enemy>comparingInt(Enemy::getThreatLevel)
                    .thenComparingInt(Enemy::getHealth)
                    .reversed() // HP terendah
                )
                .orElse(null);
        } else if (attacker instanceof Enemy) {
            // Enemy target: Player dengan HP tertinggi [cite: 34]
            return aliveDefenders.stream()
                .filter(c -> c instanceof Player)
                .max(Comparator.comparingInt(Character::getHealth))
                .orElse(null);
        }
        return aliveDefenders.get(0); // Default
    }

    public void run() {
        System.out.println("=== BATTLE START ===");
        
        while (!isTeamADefeated() && !isTeamBDefeated()) {
            turn++;
            System.out.println("\n=== TURN " + turn + " ===");
            
            // Turn Team A
            for (Character a : teamA) {
                if (a.isAlive()) {
                    Character target = findTarget(a, teamB);
                    if (target != null) {
                        a.performTurn(target);
                    }
                }
            }
            // Bersihkan yang mati
            teamB.removeIf(c -> !c.isAlive());

            if (isTeamBDefeated()) break;

            // Turn Team B
            for (Character b : teamB) {
                if (b.isAlive()) {
                    Character target = findTarget(b, teamA);
                    if (target != null) {
                        b.performTurn(target);
                    }
                }
            }
            // Bersihkan yang mati
            teamA.removeIf(c -> !c.isAlive());
        }
        
        // Log Hasil [cite: 35]
        System.out.println("\n=== RESULT ===");
        if (isTeamADefeated()) {
            System.out.println("Team B menang!");
        } else if (isTeamBDefeated()) {
            System.out.println("Team A menang!");
        } else {
            System.out.println("Pertempuran berakhir.");
        }
        
        System.out.println("\nSisa HP:");
        teamA.forEach(c -> System.out.println("  - " + c));
        teamB.forEach(c -> System.out.println("  - " + c));
    }
}