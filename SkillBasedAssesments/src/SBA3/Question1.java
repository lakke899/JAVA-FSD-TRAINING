package SBA3;

/*
 * Implement an ArrayDequeue and all of its methods such as add(), addFirst(), addLast(), element(), poll(), push(), remove.

 */
import java.util.*;

public class Question1 {
	// Java program to Implement ArrayDeque in Java
	public static void main(String[] args) {
		// Creating and initializing deque
		// Declaring object of integer type
		Deque<Integer> de_que = new ArrayDeque<Integer>(10);
		// Operations 1
		// add() method
		// Adding custom elements
		// using add() method to insert
		de_que.add(10);// 10,20,30,40,50
		de_que.add(20);
		de_que.add(30);
		de_que.add(40);
		de_que.add(50);
		System.out.println("After add method " + de_que);
		// Operations 2
		// addFirst() method
		// Inserting at the start
		de_que.addFirst(564);
		System.out.println("After addFirst method"+de_que);
		de_que.addFirst(291);
		System.out.println("After add first method()" + de_que);
		// Operation 3
		// addLast() method
		// Inserting at end
		de_que.addLast(24);
		System.out.println("After addLast method()" + de_que);
		de_que.addLast(14);
		System.out.println("After addLast method()" + de_que);
		// Operation 4
		// element() method : to get Head element
		System.out.println("Element using element(): " + de_que.element());
		// Operation 5
		// poll() method : to get head
		System.out.println("Head element poll : " + de_que.poll());
		// Operation 6
		// push() method
		de_que.push(265);
		System.out.println("After first push"+de_que);
		de_que.push(984);
		System.out.println("After second push"+de_que);
		de_que.push(2365);
		System.out.println("After third push"+de_que);
		// Operation 7
		// remove() method : to get head
		System.out.println("Head element remove : " + de_que.remove());
		System.out.println("The final array is: " + de_que);
	}
}
/*
 * OUTPUT
 * After add method [10, 20, 30, 40, 50]
After addFirst method[564, 10, 20, 30, 40, 50]
After add first method()[291, 564, 10, 20, 30, 40, 50]
After addLast method()[291, 564, 10, 20, 30, 40, 50, 24]
After addLast method()[291, 564, 10, 20, 30, 40, 50, 24, 14]
Element using element(): 291
Head element poll : 291
After first push[265, 564, 10, 20, 30, 40, 50, 24, 14]
After second push[984, 265, 564, 10, 20, 30, 40, 50, 24, 14]
After third push[2365, 984, 265, 564, 10, 20, 30, 40, 50, 24, 14]
Head element remove : 2365
The final array is: [984, 265, 564, 10, 20, 30, 40, 50, 24, 14]
*/
