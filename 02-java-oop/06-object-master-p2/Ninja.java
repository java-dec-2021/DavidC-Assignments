public class Ninja extends Human{
    private int stealth = 10;

    public Ninja() {
        this.name = "Ninja";
    }

    public Ninja(String name) {
        this.name = name;
    }

    public void steal(Human victim) {
        victim.health -= this.stealth;
        this.health += this.stealth;
        System.out.println(this.name + " has stolen from " + victim.name);
        System.out.println(victim.name + "'s Health : " + victim.health);
        System.out.println(this.name + "'s Health : " + this.health);
    }

    public void runAway(Human victim) {
        this.health -= 10;
        System.out.println(this.name + " has run away from " + victim.name);
        System.out.println(this.name + "'s Health : " + this.health);
    }
}
