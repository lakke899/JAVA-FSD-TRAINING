package MorningAssignment;

import java.util.Scanner;

public class TernaryLargest {
	public static void main(String args[])
    {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number : ");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
  

      int largest = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
    	
        System.out.println("Largest number  is "+ largest);
    }

}
