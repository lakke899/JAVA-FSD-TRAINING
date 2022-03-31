package DSA;
import java.util.*;
public class StackPushPopExample {//performing push operation
	static void pushElement(Stack<Integer> stk, int x) {
		//invoking push() method
		stk.push(x);
		System.out.println("push -> "+x);
		//prints modified stack 
		System.out.println("Stack : "+stk);
	}
	//performing pop operation  
	static void popElement(Stack<Integer> stk) {
		System.out.println("pop ->");
		//invoking pop() method 
		Integer x =stk.pop();
		System.out.print(x);
		System.out.println();
		//prints modified stack
		System.out.println("Stack : "+stk);
	}

	public static void main(String[] args) {
		//creating an object of Stack class
		Stack<Integer> stk =  new Stack<>();
		System.out.println("Stack : "+stk);
		pushElement(stk, 20);
		pushElement(stk, 13);
		pushElement(stk, 89);
		pushElement(stk, 90);
		pushElement(stk, 11);
		pushElement(stk, 45);
		pushElement(stk, 18);
		//popping elements from the stack 
		popElement(stk);
		popElement(stk);
		//throws exception if the stack is empty  
		try   
		{  
		popElement(stk);  
		}   
		catch (EmptyStackException e)   
		{  
		System.out.println("empty stack");  
		} 
		catch (Exception e)
		{
			System.out.println(e);
		}
	}

}
