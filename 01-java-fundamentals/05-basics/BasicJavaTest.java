import java.util.ArrayList;
public class BasicJavaTest {
    public static void main(String[] args) {

        BasicJava tester = new BasicJava();

        System.out.println("All the numbers from 1 to 255");
        tester.print1To255();
        System.out.println("");

        System.out.println("All odd numbers from 1 to 255");
        tester.printOdd1To255();
        System.out.println("");
        
        System.out.println("Sum of all the numbers from 1 to 255");
        System.out.println(tester.sum1To255());
        System.out.println("");

        int[] x = {1,3,5,7,9,13};
        tester.iterateArray(x);

        System.out.println("Max value of an array");
        tester.findMax(x);
        System.out.println("");

        ArrayList<Integer> y = new ArrayList<Integer>();
        y = tester.oddNumbers();
        System.out.println("All the odd numbers between 1 to 255");
        System.out.println(y);
        System.out.println("");

        tester.iterateArray(x);
        tester.getAverage(x);

        tester.greaterThan(3, x);

        System.out.println("Array Squared:");
        tester.iterateArray(tester.square(x));
        System.out.println("");

        int[] z = {1, 5, 10, -2};
        tester.iterateArray(z);
        System.out.println("No negatives");
        tester.iterateArray(tester.noNegatives(z));
        System.out.println("");

        tester.iterateArray(x);
        System.out.println("Max Min Average");
        System.out.println(tester.maxMinAverage(x));

        tester.iterateArray(x);
        System.out.println("Shift Array");
        tester.iterateArray(tester.shift(x));

    }
}