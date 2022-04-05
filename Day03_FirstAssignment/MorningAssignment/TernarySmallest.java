package MorningAssignment;

import java.util.Scanner;

public class TernarySmallest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int smallest = c<(a<b?a:b)?c:((a<b)?a:b);
		System.out.println("The smallest number is "+smallest);
	}

}
