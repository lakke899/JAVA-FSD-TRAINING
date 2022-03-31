package DSA;
import java.util.*;
public class PeekMethod {

	public static void main(String[] args) {
		Stack<Integer> stk= new Stack<>();  
		// pushing elements into Stack  
		stk.push(33);  
		stk.push(55);  
		stk.push(89);  
		stk.push(76);  
		System.out.println("Stack: " + stk);  
		// Access element from the top of the stack  
		Integer num = stk.peek();  
		//prints stack  
		System.out.println("Element at top: " + num);  
		}  

	

}
