package ArrayAssign;
/*3.Write a program to input an array of integers according to the user , 
and also take a input of a particular integer and find out the occurence of the intger in the array.*/

import java.util.Scanner;

public class CountOccurance {

	public static void main(String[] args) {
		int n, i=0, count=0;
		System.out.println("enter array size");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int [] array = new int[size];
		System.out.println("enter elements");
		for( i=0;i<size;i++) {
			array[i]=sc.nextInt();
		}
		System.out.println("enter the element of which you want to count number of occurances : ");
		n = sc.nextInt();
		for(i=0;i<size;i++) {
			if(array[i]==n) {
				count++;
			}
		}
		System.out.println(n+" occurs "+count+" times ");
	}

}
