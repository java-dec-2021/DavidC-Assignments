public class Human {
    protected String name;
    protected int strength = 3;
    protected int stealth = 3;
    protected int intelligence = 3;
    protected int health = 100;

    public Human() {
        this.name = "Someone";
    }

    public Human(String name) {
        this.name = name;
    }

    public void attack(Human victim) {
        victim.health -= this.strength;
        System.out.println(this.name + " has attacked " + victim.name);
        System.out.println(victim.name + "'s Health : " + victim.health);
    }
}