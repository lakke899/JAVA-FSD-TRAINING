package Loops;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args)
	{
		System.out.println("Start of the program");
		int i=1;
		while(i<=10)// to print from 1-10
		{
			System.out.print(i+",");
			i++;// 
		}
		System.out.println();
		i=10;
		while(i>=1)// to print from 10-1
		{
			System.out.print(i+",");
			i--;// 
		}
		//to print from 1-n
		System.out.println("enter a number to print from 1 to n");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		i=1;
		while(i<=n)
		{
			System.out.print(i+",");
			i++;// 
		}
		// to print from n-1
		System.out.println("enter a number to print from n to 1");
		n=sc.nextInt();
		while(n>=1)
		{
			System.out.print(n+",");
			n--;// 
		}

		System.out.println("End of the program");
	}
	}


