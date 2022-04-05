package ArrayAssign;

import java.util.Scanner;

//1.Write a program to input an array of integers according to the users, and display the duplicate array elements.


public class ArrayElements {

	public static void main(String[] args) {
		System.out.println("Enter Array Size");
		Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 int i;
		int[] arr = new  int[n];
		System.out.println("Enter elements");
		for( i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("entered elements are ");
		for(i=0;i<n;i++) {
			System.out.print(arr[i]+ " ");
		}

	}

}
