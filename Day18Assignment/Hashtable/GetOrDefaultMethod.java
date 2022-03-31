package Hashtable;
import java.util.*;
public class GetOrDefaultMethod {

	public static void main(String[] args) {
		Hashtable<Integer,String> map=new Hashtable<Integer,String>();          
	     map.put(100,"Mahesh");    
	     map.put(102,"Suresh");   
	     map.put(101,"Somesh");    
	     map.put(103,"Sathish");    
	     //Here, we specify the if and else statement as arguments of the method  
	     System.out.println(map.getOrDefault(103, "Not Found"));  
	     System.out.println(map.getOrDefault(108, "Not Found"));  

	}

}
