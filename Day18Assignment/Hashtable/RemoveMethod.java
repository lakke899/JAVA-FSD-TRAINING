package Hashtable;
import java.util.*;
public class RemoveMethod {

	public static void main(String[] args) {
		  Hashtable<Integer,String> map=new Hashtable<Integer,String>();        
		     map.put(100,"Mahesh");    
		     map.put(102,"Suresh");   
		     map.put(101,"Ramesh");    
		     map.put(103,"Kamesh");    
		     System.out.println("Before remove: "+ map);    
		       // Remove value for key 102  
		       map.remove(102);  
		       System.out.println("After remove: "+ map);  

	}

}
