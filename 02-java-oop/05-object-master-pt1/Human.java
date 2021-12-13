public class Human {
    private String name;
    private int strength;
    private int stealth;
    private int intelligence;
    private int health;

    public Human(String name) {
        this.name = name;
        this.strength = 3;
        this.stealth = 3;
        this.intelligence = 3;
        this.health = 100;
    }

    public void attack(Human victim) {
        victim.health -= this.strength;
        System.out.println(this.name + " has attacked " + victim.name);
        System.out.println(victim.name + "'s Health : " + victim.health);
    }
}