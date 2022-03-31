package Hashtable;
import java.util.*;
public class ClearMethod {

	public static void main(String[] args) {
		// Creating an empty Hashtable
        Hashtable<Integer, String> hash_table = new Hashtable<Integer, String>();
  
        // Inserting Values into table
        hash_table.put(10, "Well");
        hash_table.put(15, "Come");
        hash_table.put(20, "To");
        hash_table.put(25, "The");
        hash_table.put(30, "Universe");
  
        // Displaying the Hashtable
        System.out.println("The Hashtable is: " + hash_table);
  
        // Clearing the hash table using clear()
        hash_table.clear();
  
        // Displaying the final Hashtable
        System.out.println("Finally the table looks like this: " + hash_table);

	}

}
