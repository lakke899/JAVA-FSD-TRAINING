package DSA;
import java.util.*;
public class StackEmptyMethod {

	public static void main(String[] args) {
		//creating an instance of Stack class  
		Stack<Integer> stk= new Stack<>();  
		// checking stack is empty or not  
		boolean result = stk.empty();  
		System.out.println("Is the stack empty? " + result);  
		// pushing elements into stack  
		stk.push(55);  
		stk.push(22);  
		stk.push(56);  
		stk.push(115);  
		//prints elements of the stack  
		System.out.println("Elements in Stack: " + stk);  
		result = stk.empty();  
		System.out.println("Is the stack empty? " + result);  
		}   
	

}
