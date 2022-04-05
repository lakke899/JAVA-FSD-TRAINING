package ArrayList;
//Create a arraylist of integers and find the sum and average of the entire list.
import java.util.*;
public class Question2 {
public static void main(String[] args) {
	ArrayList<Integer> List = new ArrayList<Integer>();
	List.add(20);
	List.add(50);
	List.add(76);
	List.add(19);
	List.add(44);
	double sum = 0;
	for(Integer num:List) {
		sum+=num;
	}
	System.out.println("Sum of the List : "+sum);
	double Average = sum/List.size();
	System.out.println("Average of the list : "+Average);
}
}
