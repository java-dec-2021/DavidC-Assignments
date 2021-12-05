import java.util.Random;
public class PuzzleJavaTest {
    public static void main(String[] args) {
        PuzzleJava tester = new PuzzleJava();

        int[] myArray = new int[10];
        myArray = tester.getTenRolls();
        System.out.println("Ten Rolls");
        System.out.println(tester.printArray(myArray));

        System.out.println("Random Letter");
        System.out.println(tester.getRandomLetter());

        System.out.println("Random String");
        System.out.println(tester.generatePassword());

        System.out.println("Array of random Strings");
        Random generator = new Random();
        int length = generator.nextInt(5) + 5;
        System.out.println("Length = " + length);
        String[] random = new String[length];
        random = tester.getNewPasswordSet(length);
        System.out.println(tester.printArray(random));

        System.out.println("Random ordered Array of random Strings");
        System.out.println(tester.printArray(random));
        System.out.println(tester.printArray(tester.shuffleArray(random)));
    }
}
