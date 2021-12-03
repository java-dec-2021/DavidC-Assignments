import java.util.ArrayList;
public class BasicJava {
    
    //Write a method that prints all the numbers from 1 to 255
    public void print1To255() {
        for ( int i = 1;i <=255; i++) {
            System.out.println(i);
        }
    }

    //Write a method that prints all odd numbers from 1 to 255
    public void printOdd1To255() {
        for ( int i = 1;i <=255; i++) {
            if ( i%2 != 0) {
                System.out.println(i);
            }
        }
    }

    //Write a method that creates and returns a sum variable that adds up all the numbers from 1 to 255
    public int sum1To255() {
        int sum = 0;
        for ( int i = 1;i <=255; i++) {
            sum +=i;
        }
        return sum;
    }

    //write a method that would iterate through each member of an array and print each value on the screen
    public void iterateArray(int[] myArray) {
        String output = "";
        for ( int i = 0; i < myArray.length; i++) {
            output += " ";
            output += myArray[i];

        }
        System.out.println(output);
    }

    //Write a method that takes any array and prints the maximum value in the array
    public void findMax(int[] myArray) {
        int max = myArray[0];
        for ( int i = 1; i < myArray.length; i++) {
            if ( myArray[i] > max){
                max = myArray[i];
            }
        }
        System.out.println(max);
    }

    //Write a method that creates an array 'y' that contains all the odd numbers between 1 to 255
    public ArrayList<Integer> oddNumbers() {
        ArrayList<Integer> myArrayList = new ArrayList<Integer>();
        for ( int i = 0; i <=255; i++) {
            if ( i%2 != 0) {
                myArrayList.add(i);
            }
        }
        return myArrayList;
    }

    //Write a method that takes an array, and prints the AVERAGE of the values in the array
    public void getAverage(int[] myArray) {
        int sum = 0;
        for ( int i = 1; i < myArray.length; i++) {
            sum += myArray[i];
        }
        float avg = sum / myArray.length;
        System.out.println("Average = " + avg);
    }

    //Write a method that takes an array and returns the number of values in that array whose value is greater than a given value y
    public void greaterThan(int y, int[] myArray) {
        int greater = 0;
        for ( int i = 0; i < myArray.length; i++) {
            if ( myArray[i] > y ) {
                greater++;
            }
        }
        System.out.println(greater + " greater than " + y);
    }

    //Write a method that multiplies each value in the array by itself
    public int[] square(int[] myArray) {
        for ( int i = 0; i < myArray.length; i++) {
            myArray[i] *= myArray[i];
        }
        return myArray;
    }

    //Write a method that replaces any negative number with the value of 0
    public int[] noNegatives(int[] myArray) {
        for ( int i = 0; i < myArray.length; i++) {
            if ( myArray[i] < 0) {
                myArray[i] = 0;
            }
        }
        return myArray;
    }

    //Write a method that returns an array with the maximum number in the array, the minimum value in the array, and the average of the values in the array
    public ArrayList<Object> maxMinAverage(int[] myArray) {
        int sum = 0;
        int max = myArray[0];
        int min = myArray[0];
        for ( int i = 1; i < myArray.length; i++) {
            if ( myArray[i] > max){
                max = myArray[i];
            }

            if ( myArray[i] < min){
                min = myArray[i];
            }

            sum += myArray[i];
        }
        float avg = sum / myArray.length;

        ArrayList<Object> list = new ArrayList<Object>();
        list.add(max);
        list.add(min);
        list.add(avg);
        return list;
    }

    //Write a method that shifts each number by one to the front in an array
    public int[] shift(int[] myArray) {
        for ( int i = 0; i < myArray.length - 1; i++) {
            myArray[i] = myArray[i+1];
        }
        myArray[myArray.length - 1] = 0;
        return myArray;
    }
}
