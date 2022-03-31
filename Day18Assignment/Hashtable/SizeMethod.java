package Hashtable;
import java.util.*;
public class SizeMethod {

	public static void main(String[] args) {
		 // Creating an empty Hashtable
        Hashtable<Integer, String> hash_table =  new Hashtable<Integer, String>();
  
        // Inserting elements into the table
        hash_table.put(10, "Well");
        hash_table.put(15, "It's");
        hash_table.put(20, "a");
        hash_table.put(25, "New");
        hash_table.put(30, "Day");
  
        // Displaying the Hashtable
        System.out.println("Initial table is: " + hash_table);
  
        // Displaying the size of the table
        System.out.println("The size of the table is " + 
        hash_table.size());

	}

}
