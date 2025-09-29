public class BossMonster extends Character {
    private String type;

    public BossMonster(String name, int health, int attackPower, String type) {
        super(name, health, attackPower);
        this.type = type;
    }

    @Override
    public void attack(Character target) {
        int damage = (int)(Math.random() * 15) + 10; 
        damage *= 2; // serangan 2x lipat
        System.out.println(getName() + " (" + type + ") unleashes a SPECIAL attack! Damage: " + damage);
        target.takeDamage(damage);
    }
}
