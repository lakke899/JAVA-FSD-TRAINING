package StringsAssignment;
import java.lang.*;
import java.util.Scanner;
/*1.Write a program to take take two strings as an input from the user and check
if the second one is a substring of the first.*/
	public class SubString {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter first string");
			String string1=sc.next();
			System.out.println("enter second string");
			String string2=sc.next();
			// contains() used to check if one string contains another string in java or not.it returns boolean value
			boolean c=string1.contains(string2);
			boolean d=string2.contains(string1);
			if(c==true){
				System.out.println(string2+" is substring of "+string1);
			}
			else if (d==true){
				System.out.println(string1+" is a substring of "+string2);
			}
			else {
				System.out.println(string1+ " is not a sub string of "+string2);
			}
		}
	}