package AfternoonAssignment;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		int r,s=0;
		System.out.println("Enter any number ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c=n;
		while(n>0) {
			 r=n%10;
			 s=(s*10)+r;
			n=n/10;
		}
		if(c==s) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}

}
