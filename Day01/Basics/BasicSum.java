package Basics;

import java.util.Scanner;
public class BasicSum
{	
	static int samp=5;//global variable (class varaible)
	public static void main(String[] args)
	{
		double a,b,c;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the first value");
		a=s.nextDouble();
		System.out.println("enter the Second value");
		b=s.nextDouble();
		c=a+b;
		System.out.println("sum="+c);
		showsample();
	}
	public static void showsample()
	{
		int a=15;//local variable
		System.out.print(a);
	}
}

