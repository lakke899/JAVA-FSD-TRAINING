package StringsAssignment;
import java.lang.*;
import java.util.*;

/*2.Write a program to take input of a String and also take in a number of characters as the
user wishes and check if they are present in the String.*/

	public class CharPresentInString {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter your string");
			String s=sc.next();
			System.out.println("enter no of characters as you wish");
			int character=sc.nextInt();
			int count=0;
			for(int i=0;i<s.length();i++) {
					if(s.charAt(i)!=' ') {
						count++;
					}
			}
			System.out.println("total no of characters in your string "+count);
			if(count>=character) {
				System.out.println("given number of characters are present in string");
			}
			else {
				System.out.println("you entered more than length of  the string");
			}
	}





	}