package Conditions;

import java.util.Scanner;

//to check if a person can donate blood. Condition1= age>18, condition 2=weight>50
public class NestedIf {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age");
		int age=sc.nextInt();
		if(age>=18)
		{
			System.out.println("enter the weight");
			int weight=sc.nextInt();
			if(weight>50)
			{
				System.out.println("you are eligible to donate blood");
			}
			else
			{
				System.out.println("you are not eligible to donate blood");
			}
		}
		else
		{
			System.out.println("Age must be greater than 18");
		}
	}

}
