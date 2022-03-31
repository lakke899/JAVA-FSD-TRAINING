package Loops;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args)
	{
		System.out.println("to print from 1-10");
		//to print from 1-10
		int i=1;
		do
		{
			System.out.print(i+",");
			i++;
		}while(i<=10);
		System.out.println();
		System.out.println("to print from 10-1");
		//to print from 10-1
		i=10;
		do
		{
			System.out.print(i+",");
			i--;
		}while(i>=1);
		System.out.println();
		System.out.println("enter a number to print from 1-n");
		//to print from 1-n
		i=1;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		do
		{
			System.out.print(i+",");
			i++;
		}while(i<=n);
		System.out.println();
		System.out.println("enter a number to print from n-1");
		//to print from n-1
		n=sc.nextInt();
		do
		{
			System.out.print(n+",");
			n--;
		}while(n>=1);

	}

}
