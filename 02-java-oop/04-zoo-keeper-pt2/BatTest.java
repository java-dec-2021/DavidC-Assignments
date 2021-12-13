public class BatTest {
    public static void main(String[] args){
        GiantBat louisville = new GiantBat();
        louisville.attackTown("Manhattan");
        louisville.attackTown("Springfield");
        louisville.attackTown("Burbank");

        louisville.eatHumans("George");
        louisville.eatHumans("Billy");

        louisville.fly();
        louisville.fly();

        louisville.displayEnergy();
    }
}
