package HashTable;
import java.util.*;
public class Hashtable2 {

	public static void main(String[] args) {
		Hashtable<Integer,String> obj = new Hashtable<Integer,String>();
		obj.put(100, "Amit");
		obj.put(102,"Ravi");
		 obj.put(101,"Vijay");    
	     obj.put(103,"Rahul"); 
	     System.out.println("Before remove : "+obj);
	  // Remove value for key 102 
	     obj.remove(102);
	     System.out.println("After remove : "+obj);
	}

}
