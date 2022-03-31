package Deque;
import java.util.*;
public class ArrayDequeDemo {
	// Java program to demonstrate the
	// addition of elements in deque
	public static void main(String[] args) {
		// Initializing an deque
		Deque<String> dq = new ArrayDeque<String>();
		// add() method to insert
		dq.add("To");
		dq.addFirst("Welcome");
		dq.addLast("Java");
		System.out.println(dq);
	}

}
