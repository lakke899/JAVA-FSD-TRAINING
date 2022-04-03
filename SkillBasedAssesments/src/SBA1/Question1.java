package SBA1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Question1 {
	/*
	 * 1.Write a program to create a arraylist of double element and add the
	 * elements. sort the elements in descending order and print it.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ArrayList Size");
		int size = sc.nextInt();
		System.out.println("Enter Elements ");
		ArrayList<Double> Elements = new ArrayList<Double>(size);
		for (int i = 0; i < size; i++) {
			Elements.add(sc.nextDouble());
		}
		System.out.println("Entered ArrayList Elements Before Sorting Are \n" + Elements);
		Collections.sort(Elements, Collections.reverseOrder());
		System.out.println("Entered ArrayList Elements After Sorting in Descending Order are\n" + Elements);

	}

}
/*Enter ArrayList Size
4
Enter Elements 
22.55
99.88
44.88
33.99
Entered ArrayList Elements Before Sorting Are 
[22.55, 99.88, 44.88, 33.99]
Entered ArrayList Elements After Sorting in Descending Order are
[99.88, 44.88, 33.99, 22.55]*/