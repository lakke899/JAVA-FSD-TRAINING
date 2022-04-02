package SBA1;

import java.util.Scanner;

public class Question4 {
	/*
	 * 4.Write a program to check for the occurrence of a particular character in a
	 * string and display how many times it has occurred. note: take the String and
	 * the character to be checked as a input from the user.
	 * 
	 */
	public static void main(String[] args) {
		System.out.println("Enter any String");
		Scanner sc = new Scanner(System.in);
		String S=sc.next();
		System.out.println("enter the character ");
		char search=sc.next().charAt(0);
		int count=0;
		for(char ch:S.toCharArray()) {
			if (ch==search) {
				count++;
			}
		}
		System.out.println("no of occurencews of character.... "+count);
	}

}

/* OUTPUT
Enter any String
rajashekar
enter the character 
a
no of occurencews of character.... 3
*/