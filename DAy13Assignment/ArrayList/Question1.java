package ArrayList;
/*Write a program to create a arraylist of double element and add the elements.
sort the elements in descending order and print it*/
import java.util.*;
public class Question1 {
public static void main(String[] args) {
	ArrayList<Double> List = new ArrayList<Double>();
	List.add(10.22);
	List.add(50.56);
	List.add(20.44);
	List.add(5.60);
	System.out.println("Unsorted ArrayList  "+List);
	Collections.sort(List, Collections.reverseOrder());
	System.out.println("Sorted ArrayList in Descending order  "+ List);
	
	}
}
