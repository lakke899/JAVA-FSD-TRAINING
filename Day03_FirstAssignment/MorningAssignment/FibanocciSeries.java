package MorningAssignment;

import java.util.Scanner;

public class FibanocciSeries {

	public static void main(String[] args) {
		int first=0, second=1;
		System.out.println("Enter any number ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(first+" "+second);
		int next;
		for(int i=2; i< n; i++) {
			next =first+second;
			System.out.print(" "+next+ " ");
			first=second;
			second=next;
		}
	}

}
