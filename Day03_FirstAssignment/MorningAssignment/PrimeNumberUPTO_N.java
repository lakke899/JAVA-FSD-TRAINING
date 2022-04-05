package MorningAssignment;

import java.util.Scanner;

public class PrimeNumberUPTO_N {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int n = sc.nextInt();
		for(int i=2;i<=n;i++) {
			int count = 0;
			for(int j=2; j<i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==0) {
				System.out.print(i+" ");		
			}
		}	
	}	
}


