import java.util.ArrayList;
public class ListOfExceptions {
    public static void main(String[] args) {
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");

        for(int i = 0; i < myList.size(); i++) {
            try {
                Integer castedValue = (Integer) myList.get(i);
                System.out.println(castedValue);
            } catch (ClassCastException e) { 
                // print out the error messages, 
                //the index of the ArrayList where the error occurred, 
                //and the value of the object that triggered the error.
                System.out.println(e);
                System.out.println("Index of ArrayList: " + i);
                System.out.println("Value at Index: " + myList.get(i));
            }
        }
        
        
    }
}