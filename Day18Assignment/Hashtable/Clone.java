package Hashtable;
import java.util.*;
public class Clone {

	public static void main(String[] args) {
		 // Creating an empty Hashtable
        Hashtable<Integer, String> hash_table = new Hashtable<Integer, String>();
  
        // Putting values into the table
        hash_table.put(10, "Hey");
        hash_table.put(15, "this");
        hash_table.put(20, "is");
        hash_table.put(25, "a");
        hash_table.put(30, "message");
  
        // Displaying the Hashtable
        System.out.println("The Hashtable is: " + hash_table);
  
        // Displaying the cloned Hashtable using clone()
        System.out.println("The cloned table look like this: "
                           + hash_table.clone());

	}

}
