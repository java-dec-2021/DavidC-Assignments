public class Wizard extends Human{
    private int intelligence = 8;
    private int health = 50;
    
    public Wizard() {
        this.name = "Wizard";
    }

    public Wizard(String name) {
        this.name = name;
    }

    public void heal(Human victim) {
        victim.health += this.intelligence;
        System.out.println(this.name + " has healed " + victim.name);
        System.out.println(victim.name + "'s Health : " + victim.health);
    }

    public void fireBall(Human victim) {
        victim.health -= (this.intelligence * 3);
        System.out.println(this.name + " shot a fireball at " + victim.name);
        System.out.println(victim.name + "'s Health : " + victim.health);
    }
}
