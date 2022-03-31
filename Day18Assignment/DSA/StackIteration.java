package DSA;
import java.util.*;
public class StackIteration {

	public static void main(String[] args) {
		//creating an object of Stack class  
		Stack stk = new Stack();  
		//pushing elements into stack  
		stk.push(67);  
		stk.push(23);  
		stk.push(34);  
		stk.push(87);  
		stk.push(21);  
		//iteration over the stack  
		Iterator iterator = stk.iterator();  
		while(iterator.hasNext())  
		{  
		Object values = iterator.next();  
		System.out.println(values);   
		}     
	}

}
