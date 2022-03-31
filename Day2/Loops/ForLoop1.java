package Loops;

import java.util.Scanner;

public class ForLoop1 {
	public static void main(String[] args)
	{
		//print from 1-10
		for(int i=1;i<=10;i++)
		{
			System.out.print(i+",");
		}
		System.out.println();
		System.out.println("to print from 10-1");
		for(int i=10;i>=1;i--)
		{
			System.out.print(i+",");
		}
		System.out.println();
		System.out.println("to print from 1-n");
		System.out.println("enter n");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.print(i+",");
		}
		System.out.println();
		System.out.println("to print from n-1");
		System.out.println("enter n");
		n=sc.nextInt();
		for(int i=n;i>=1;i--)
		{
			System.out.print(i+",");
		}
	}
}
