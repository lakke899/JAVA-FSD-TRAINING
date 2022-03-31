package ArrayList;
//ArrayList example to add elements
import java.util.*;
public class ArrayList6 {
	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<String>();
		System.out.println("Initial list of elements: "+a1);
		a1.add("Ravi");
		a1.add("Vijay");
		a1.add("Ajay");
		System.out.println("After invoking add(E e) method: "+a1);  
		//Adding an element at the specific position
		a1.add("Gaurav");
		System.out.println("After invoking add(int index, E element) method: "+a1);
		ArrayList<String> a2=new ArrayList<String>();  
        a2.add("Sonoo");  
        a2.add("Hanumat");
        a2.add("Arun");
        a2.add("Mahesh"); 
      //Adding second list elements to the first list
        a1.addAll(a2);
        System.out.println("After invoking addAll(Collection<? extends E> c) method: "+a1);
        ArrayList<String> a3=new ArrayList<String>();  
        a3.add("John");  
        a3.add("Rahul");  
        //Adding second list elements to the first list at specific position
        a1.addAll(1, a3);  
        System.out.println("After invoking addAll(int index, Collection<? extends E> c) method: "+a1);
	}

}
