public class Samurai extends Human{
    private int health = 200;
    private static int numberOfSamurai = 0;

    public Samurai() {
        this.name = "Samurai";
        numberOfSamurai++;
    }

    public Samurai(String name) {
        this.name = name;
        numberOfSamurai++;
    }

    public void deathBlow(Human victim) {
        victim.health = 0;
        this.health = this.health / 2;
        System.out.println(this.name + " has executed a death blow on " + victim.name);
        System.out.println(victim.name + "'s Health : " + victim.health);
        System.out.println(this.name + "'s Health : " + this.health);
    }

    public void meditate() {
        this.health = this.health * 2;
        System.out.println(this.name + " has meditated.");
        System.out.println(this.name + "'s Health : " + this.health);
    }

    public static void howMany() {
        System.out.println("Number of Samurai : " + numberOfSamurai);
    }
}
