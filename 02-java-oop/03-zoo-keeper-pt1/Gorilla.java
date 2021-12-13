public class Gorilla extends Mammal{
    public void throwSomething(String something) {
        System.out.println("The Gorilla just threw " + something);
        this.energyLevel -= 5;
    }

    public void eatBananas() {
        System.out.println("The Gorilla ate some bananas.");
        this.energyLevel += 10;
    }

    public void climb() {
        System.out.println("The Gorilla climbed a tree.");
        this.energyLevel -= 10;
    }
}
