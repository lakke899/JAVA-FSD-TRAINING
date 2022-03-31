package Hashtable;
import java.util.*;
public class Contains {
	public static void main(String[] args)
    {
        // Creating an empty Hashtable
        Hashtable<Integer, String> hash_table = 
        new Hashtable<Integer, String>();
  
        // Mapping string values to int keys
        hash_table.put(10, "Hello");
        hash_table.put(15, "World");
        hash_table.put(20, "How's");
        hash_table.put(25, "the");
        hash_table.put(30, "day");
  
        // Displaying the HashMap
        System.out.println("Initial Table is: " + hash_table);
  
        // Checking for the Value 'Hi'
        System.out.println("Is the value 'Hi' present? " + 
        hash_table.contains("Hi"));
  
        // Checking for the Value 'World'
        System.out.println("Is the value 'World' present? " + 
        hash_table.contains("World"));
    }
}
