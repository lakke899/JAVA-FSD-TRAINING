package SBA3;
//Implement a PriorityQueue and use all the methods.
import java.util.*;

public class Question2 {

	public static void main(String[] args) {
		PriorityQueue<String> pq = new PriorityQueue<>();
		pq.add("ajay");
		pq.add("vijay");
		pq.add("raj");
		pq.add("gagan");
		System.out.println("head:" + pq.element()); // returns 1st element
		System.out.println("head:" + pq.peek()); // returns 1st element
		System.out.println("iterating queue elements");
		Iterator itr = pq.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		pq.remove(); // deletes head element
		pq.poll(); // removes head
		System.out.println("after removing 2 elements");
		Iterator itr2 = pq.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());

		}

	}

}
/*
 * OUTPUT: head:ajay head:ajay iterating queue elements ajay gagan raj vijay
 * after removing 2 elements raj vijay
 */