package ArrayAssign;

import java.util.Scanner;

//2.Write a program to input an array of integers according to the users, and find the greatest value of them.
public class Greatest {
	public static void main(String[] args) {
		int i; int max;
		System.out.println("Enter array size");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int [] array = new int[size];
		max = array[0];
		System.out.println("enter elements");
		for(i=0;i<size;i++) {
			array[i]=sc.nextInt();
		}
		for(i=0;i<size;i++) {
			if(array[i]>max) {
				max = array[i];
			}
			
		}
		System.out.println("Largest number in array is : "+max);
	}

}
