package DSA;
import java.util.*;
public class StackSearchMethodExample {

	public static void main(String[] args) {
		Stack<String> stk = new Stack<>();
		//pushing elements into Stack  
		stk.push("Mac Book");  
		stk.push("HP");  
		stk.push("DELL");  
		stk.push("Asus"); //top=1 
		System.out.println("Stack: " + stk);  
		// Search an element 
		int search = stk.search("HP");
		if(search>0) {
			System.out.println("Location of HP : "+search);
		}
		else {
			System.out.println("Element is not found");
		}
	}

}
