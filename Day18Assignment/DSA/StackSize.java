package DSA;
import java.util.*;
public class StackSize {

	public static void main(String[] args) {
		Stack stk = new Stack();  
		stk.push(98);  
		stk.push(112);  
		stk.push(34);  
		stk.push(46);  
		stk.push(56);  
		// Checks the Stack is empty or not  
		boolean rslt=stk.empty();  
		System.out.println("Is the stack empty or not? " +rslt);  
		// Find the size of the Stack  
		int x=stk.size();  
		System.out.println("The stack size is: "+x);  
		} 

}
