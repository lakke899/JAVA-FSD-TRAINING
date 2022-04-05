package StringsAssignment;
import java.lang.*;
/*4.Write a program to check for the occurance of a particular character in a string and display how many times it has occured.
note: take the String  and the character to be checked as a input from the user.*/
import java.util.Scanner;
public class CharOccurence {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the string");
			String s1=sc.next();
			System.out.println("enter the character");
			char search=sc.next().charAt(0);
			int count=0;
			for(char ch:s1.toCharArray()) {
				if(ch==search) {
					count++;
				}
			}
			System.out.println("no of occurences of character..."+count);

			}
		}


