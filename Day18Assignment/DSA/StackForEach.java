package DSA;
import java.util.*;
public class StackForEach {

	public static void main(String[] args) {
		//creating an instance of Stack class  
		Stack <Integer> stk = new Stack<>();  
		//pushing elements into stack  
		stk.push(33);  
		stk.push(11);  
		stk.push(12);  
		System.out.println("Iteration over the stack using forEach() Method:");  
		//invoking forEach() method for iteration over the stack  
		stk.forEach(n ->  
		{  
		System.out.println(n);  
		});  
		  

	}

}
