package Deque;
import java.util.*;
public class DequeInteger {
	// Java program to demonstrate the
	// creation of deque object using the
	// ArrayDeque class in Java
	public static void main(String[] args) {
		// Initializing an deque
		Deque<Integer> dq = new ArrayDeque<Integer>(10);
		// add() method to insert
		dq.add(10);
		dq.add(20);
		dq.add(30);
		dq.add(40);
		dq.add(50);
		System.out.println(dq);
		//clear() method
		dq.clear();
		System.out.println(dq);
		// addFirst() method to insert the
        // elements at the head
		dq.addFirst(564);
		dq.addFirst(291);
        // addLast() method to insert the
        // elements at the tail
		dq.addLast(24);
		dq.addLast(14);
		System.out.println(dq);
	}

}
