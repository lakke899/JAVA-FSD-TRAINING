package Basics;

import java.util.Scanner;
public class Basics {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter any  number : ");
		double num1 = sc.nextDouble(); 
		double num2 = sc.nextDouble();
		double num3 = sc.nextDouble();
		double a = (num1*num2*num3)/3;
		System.out.println(a);
	}

}
