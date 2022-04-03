package SBA1;

import java.util.ArrayList;
import java.util.Scanner;

public class Question2 {
	/*2.Create a arraylist of integers and find the sum and average of the entire
	 list.*/
	public static void main(String[] args) {
		ArrayList<Integer> List=new ArrayList<Integer>();
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of ArrayList");
		int size=sc.nextInt();
		for(int i=0; i<size;i++) {
			
			List.add(sc.nextInt());
		}
		System.out.println("Entered ArrayList Elements are\n"+List);
		for (int i:List) {
			sum+=i;
		}
		System.out.println("Sum Of ArrayList is\n"+sum);
		double Average=sum/List.size();
		System.out.println("Average of the ArrayList is\n"+Average);

	}

}
/*Enter the size of ArrayList
4
4
4
4
4
Entered ArrayList Elements are
[4, 4, 4, 4]
Sum Of ArrayList is
16
Average of the ArrayList is
4.0*/