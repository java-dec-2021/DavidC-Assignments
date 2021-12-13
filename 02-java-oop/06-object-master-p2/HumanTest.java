public class HumanTest {
    public static void main(String[] args) {
        Human jerry = new Human("Jerry");
        Human billy = new Human("Billy");

        Wizard wizard = new Wizard();
        Ninja ninja = new Ninja();
        Samurai samurai1 = new Samurai();
        Samurai samurai2 = new Samurai("Mushashi");

        billy.attack(jerry);

        wizard.fireBall(billy);
        wizard.heal(jerry);
        
        ninja.steal(billy);
        ninja.runAway(jerry);

        samurai1.deathBlow(jerry);
        samurai1.meditate();
        samurai2.deathBlow(billy);
        Samurai.howMany();
    }
}
