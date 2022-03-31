package DSA;
import java.util.*;


public class StackSizeExample {

	public static void main(String[] args) {
		Stack<Integer> stk = new Stack<>();
		stk.push(22);
		stk.push(33);
		stk.push(44);
		stk.push(55);
		stk.push(66);
		boolean result=stk.empty();// Checks the Stack is empty or not
		System.out.println("The Stack is empty : "+result);
		// Find the size of the Stack
		int size=stk.size();
		System.out.println("The stack size is : "+size);
	}

}
