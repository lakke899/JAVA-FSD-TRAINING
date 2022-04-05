package ArrayAssign;

import java.util.Scanner;

public class DuplicateArrayEx {

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number of integers we want to enter");
      int n=sc.nextInt();
      int[] arr = new int[n];
      System.out.println("Enter the number elements");
      for(int i=0;i<n;i++) {
    	  arr[i]=sc.nextInt();
      }
      System.out.println("The array elements are");
      for(int i=0;i<n;i++) {
    	  System.out.print(arr[i]+",");
      }
    	  System.out.print(" ");
      System.out.println("The duplicate elements are");
      for(int i=0;i<arr.length;i++) {
    	  for(int j=i+1;j<n;j++) {
    		  if(arr[i]==arr[j]) {
    			  System.out.println(arr[j]);
    	  }
      }
 
      }
	}
}
