package DSA;
import java.util.*;
public class ListIterator {
	public static void main (String[] args)   
	{   
	Stack <Integer> stk = new Stack<>();  
	stk.push(58);  
	stk.push(45);  
	stk.push(34);  
	java.util.ListIterator<Integer> ListIterator = stk.listIterator(stk.size());  
	System.out.println("Iteration over the Stack from top to bottom:");  
	while (ListIterator.hasPrevious())   
	{  
	Integer avg = ListIterator.previous();  
	System.out.println(avg);  
	}  
	}  
}
