import java.util.List;

public class GameTest {
    public static void main(String[] args) {
        // --- SETUP KARAKTER ---
        
        // Player dengan LevelScaledStrategy
        Player p = new Player("HeroVipkas", 120, 25, 5, new LevelScaledStrategy(2));
        p.addSkill(new HealSkill(15));
        p.addSkill(new PiercingStrikeSkill(1.2));

        // BossMonster dengan FixedStrategy
        BossMonster boss = new BossMonster("Drake", 150, 28, 5, new FixedStrategy());
        
        // Monster dengan FixedStrategy
        Monster monster = new Monster("Goblin", 80, 12, 2, new FixedStrategy());

        // --- SETUP EFEK AWAL ---
        // Tambah efek awal [cite: 27]
        p.addEffect(new ShieldEffect(10, 3)); // Mengurangi 10 dmg selama 3 turn
        p.addEffect(new RegenEffect(8, 4));  // Memulihkan 8 HP selama 4 turn
        
        // --- SETUP TEAM ---
        List<Character> teamA = List.of(p);
        List<Character> teamB = List.of(boss, monster);
        
        System.out.println("=== SETUP ===");
        System.out.println("Team A:");
        teamA.forEach(c -> {
            System.out.println("  - " + c);
            if (c instanceof Player player) {
                System.out.println("    Skills: " + player.getSkills().stream().map(Skill::name).toList());
            }
            System.out.println("    Effects: " + c.getEffects().stream().map(StatusEffect::name).toList());
        });
        System.out.println("Team B:");
        teamB.forEach(c -> System.out.println("  - " + c));
        System.out.println("--------------------");

        // --- JALANKAN BATTLE ---
        Battle battle = new Battle(teamA, teamB);
        battle.run();
    }
}