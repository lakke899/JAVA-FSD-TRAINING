package ArrayList;
import java.io.*;
import java.util.*;
public class Question2Ex {
public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number of elements you want ::");
     int n = sc.nextInt(), sum = 0;
     double avg = 0;
     System.out.println("Enter " + n + " integer values::");
     ArrayList<Integer> ard = new ArrayList<Integer>();
     for (int i = 0; i < n; i++) {
         ard.add(sc.nextInt());
     }
     System.out.println("\nOriginal arraylist :: " + ard);
     // finding sum
     for (int i : ard) {
         sum += i;
     }
     System.out.println("\nSum of all elements in the arraylist = " + sum);
     // finding average
     avg = (double) sum / ard.size();
     System.out.println("\nAverage of all elements = " + avg);

     sc.close();
 }

}

