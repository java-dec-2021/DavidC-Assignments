import java.util.ArrayList;
// You will need to import the Random library from java.util
import java.util.Random;

public class PuzzleJava {
    Random generator = new Random();

    //Write a method that will generate and return an array with 10 random numbers between 1 and 20 inclusive.
    public int[] getTenRolls() {
        int[] myArray = new int[10]; // Initialize array to hold random numbers
        int dice = 0; // Initialize variable for random number 
        
        // For Loop to iterate through array
        for (int i = 0; i < myArray.length; i++) {
            dice = generator.nextInt(20) + 1; // Assign dice to random number between 1 and 20 inclusive
            myArray[i] = dice; // Assign dice to value at index in array
        }

        return myArray;
    }

    //Write a method that will:
        //Create an array within the method that contains all 26 letters of the alphabet (this array must have 26 values). 
        //Generate a random index between 0-25, and use it to pull a random letter out of the array.
        //Return the random letter.
    public char getRandomLetter(){
        char[] myArray = new char[26]; // Initialize array to hold alphabet
        char output = 'a'; // Initialize output character
        int number = (int) output; // Initialize integer to convert to output character
        int dice = 0; // Initialize variable for random number
        
        //Iterate through array and assign characters to index
        for( int i = 0; i < myArray.length; i++){
            number = i + 97;
            myArray[i] = (char) number; // assign value in array at index i to corresponding letter. a = 97, b = 98, etc.
        }

        dice = generator.nextInt(26); // assign dice to random number between 0 and 25
        output = myArray[dice]; // assign output to letter in array at random index
        return output;
    }

    //Write a method that uses the previous method to create a random string of eight characters, and return that string
    public String generatePassword(){
        PuzzleJava tester = new PuzzleJava(); //declare instance of PuzzleJava class
        String output = ""; // Intialize empty string for output

        for (int i = 0; i < 8; i++){ //for loop to create 8 character string
            output += tester.getRandomLetter(); //use previous method to add to random letter to output
        }

        return output;
    }

    //Write a method that takes an int length as an argument and creates an array of random eight character words
    public String[] getNewPasswordSet(int length){ // method takes in length of array
        PuzzleJava tester = new PuzzleJava(); //declare instance of PuzzleJAva class
        String[] output = new String[length]; // Intialize empty array of strings for output

        for (int i = 0; i < output.length; i++){ // for loop to assign values to array
            output[i] = tester.generatePassword(); // assigns random generated string to output at index
        }

        return output;
    }

    //Write a method that takes an array and and mixes up all the values in a pseudo-random way
    public String[] shuffleArray(String[] myArrayList){ //method takes in String array
        String[] output = new String[myArrayList.length]; // Intialize empty array of strings for output
        int[] dice = new int[myArrayList.length]; // Initialize array of integers to hold random numbers

        dice[0] = generator.nextInt(myArrayList.length); // assign first index to random number
        for (int i = 1; i < myArrayList.length; i++){ // for loop to give each index after 0 a turn to roll dice
            
            boolean inArray = true; // Initialize condition if number in array and set to true
            
            while(inArray)// while loop to repeat call for random number
            {
                inArray = false; // assume random number is unique until check
                dice[i] = generator.nextInt(myArrayList.length); // assign random number to dice at index
                
                for(int j = 0; j < i; j++) { //for loop to check if roll is unique
                    if (dice[i] == dice[j]) {// if roll equals any other in index change condition to true
                        inArray = true;
                    }
                }
                
            }
        }

        for (int i = 0; i < myArrayList.length; i++) { // for loop to iterate through output, input, and dice array 
            output[i] = myArrayList[dice[i]]; // assign input array value at index of value in dice array at index to value in output at index
        }

        return output;
    }

    //Method to format integer arrays on one line for a better output
    public String printArray(int[] myArray) {
        String output = "";
        for (int i = 0; i < myArray.length; i++){
            output += myArray[i];
            output += " ";

        }
        return output;
    }

    //Method to format character arrays on one line for a better output
    public String printArray(char[] myArray) {
        String output = "";
        for (int i = 0; i < myArray.length; i++){
            output += myArray[i];
            output += " ";

        }
        return output;
    }

    //Method to format String arrays on one line for a better output
    public String printArray(String[] myArray) {
        String output = "";
        for (int i = 0; i < myArray.length; i++){
            output += myArray[i];
            output += " ";

        }
        return output;
    }
}