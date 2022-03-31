package Hashtable;
import java.util.*;
public class PutIfAbsentMethod {

	public static void main(String[] args) {
		Hashtable<Integer,String> map=new Hashtable<Integer,String>();          
	     map.put(100,"Shiva");    
	     map.put(102,"Ravi");   
	     map.put(101,"Abhi");    
	     map.put(103,"Rahul");    
	     System.out.println("Initial Map: "+map);  
	     //Inserts, as the specified pair is unique  
	     map.putIfAbsent(104,"Sai");  
	     System.out.println("Updated Map: "+map);  
	     //Returns the current value, as the specified pair already exist  
	     map.putIfAbsent(101,"Vijay");  
	     System.out.println("Updated Map: "+map);  

	}
	
}
