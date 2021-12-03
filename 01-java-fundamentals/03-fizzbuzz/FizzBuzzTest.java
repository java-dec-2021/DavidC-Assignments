public class FizzBuzzTest {
    // This will be the launch point for the application
    // For now, we are using this method to test our FizzBuzz methods
    public static void main(String[] args) {
        FizzBuzz tester = new FizzBuzz();

        System.out.println(tester.fizzBuzz(9));
        System.out.println(tester.fizzBuzz(10));
        System.out.println(tester.fizzBuzz(15));
        System.out.println(tester.fizzBuzz(16));
        System.out.println(tester.fizzBuzz(2));

        for (int i = 1; i <= 50; i++) {
            System.out.println(tester.fizzBuzz(i));
        }

        for (int i = 1; i <= 50; i++) {
            System.out.println(tester.fizzBuzz(i,"Dojo","Coding","CodingDojo"));
        }
    }
}

