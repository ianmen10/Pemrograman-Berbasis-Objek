public class GameTest {
    public static void main(String[] args) {
        Player ilham = new Player("Ilham", 100, 20, 5);
        Monster goblin = new Monster("Goblin", 80, 15, "Goblin");
        BossMonster dragon = new BossMonster("Dragon", 200, 30, "Dragon");

        Character[] enemies = {goblin, dragon};

        System.out.println("=== BATTLE START ===");
        int turn = 1;

        while (ilham.getHealth() > 0 && (goblin.getHealth() > 0 || dragon.getHealth() > 0)) {
            System.out.println("\n--- Turn " + turn + " ---");

            // Player menyerang monster pertama yang masih hidup
            if (goblin.getHealth() > 0) {
                ilham.attack(goblin);
            } else if (dragon.getHealth() > 0) {
                ilham.attack(dragon);
            }

            // Player bisa heal setiap 3 turn
            if (turn % 3 == 0) {
                ilham.heal();
            }

            // Giliran musuh
            for (Character enemy : enemies) {
                if (enemy.getHealth() > 0) {
                    enemy.attack(ilham);
                }
            }

            turn++;
        }

        System.out.println("\n=== BATTLE END ===");
        if (ilham.getHealth() > 0) {
            System.out.println("Ilham wins the battle!");
        } else {
            System.out.println("The monsters defeated Ilham...");
        }
    }
}
