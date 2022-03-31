package AfternoonAssignment;

import java.util.Scanner;

public class DuckNumber {
	public static void main(String[] args) {
		System.out.println("Enter any nymber");
		Scanner sc = new Scanner(System.in);
		int n,r,c=0;
		n=sc.nextInt();
		while(n!=0) {
			r=n%10;
			if(r==0) {
				c=c+1;
			}
				n=n/10;
		}
				
		if(c>0) {
			System.out.println(" is Duck Number");
		}
		else {
			System.out.println(" is not a duck number");
		}
		
	}

}
