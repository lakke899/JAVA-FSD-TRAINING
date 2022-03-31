package AfternoonAssignment;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		int sum=0,r,s;
		System.out.println("Enter any number ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		s=n;
		while(n>0) {
			r=n%10;
			int fact =1;
			for(int i=1;i<=r;i++) {
				fact=fact*i;
			}
			n=n/10;
			sum=sum+fact;
		}
		if(s==sum) {
			System.out.println(" Strong number");
		}
		else {
			System.out.println(" Not a Strong number");
		}
	}

}
