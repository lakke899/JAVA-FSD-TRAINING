package ArrayAssign;

import java.util.Scanner;

public class GreatestArrayEx {

	public static void main(String[] args) {
		int number[],size,large;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		size=sc.nextInt();
		
		number=new int[size];
		System.out.println("Enter elements of array");
		
		for(int i=0;i<number.length;i++)
		{
			number[i]=sc.nextInt();
		}
		
		large= number[0];
		for(int i=1;i<number.length;i++)
		{
			if(large<number[i])
			{
				large=number[i];
			}
		}
		System.out.println("largest value of number:" + large);
	}
	
	}
