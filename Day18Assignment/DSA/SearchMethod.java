package DSA;
import java.util.*;
public class SearchMethod {

	public static void main(String[] args) {
		Stack<Integer> stk= new Stack<>();  
		//pushing elements into Stack  
		stk.push(12);  
		stk.push(78);  
		stk.push(87);  
		stk.push(99);  
		System.out.println("Stack: " + stk);  
		// Search an element  
		int location = stk.search(87);  
		System.out.println("Location : " + location);  
		}  
}
