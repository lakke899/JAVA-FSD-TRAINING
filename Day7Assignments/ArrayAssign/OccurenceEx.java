package ArrayAssign;

import java.util.Scanner;
public class OccurenceEx {

public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
	 int n;    
	 System.out.println("Enter the total number of elements: ");
	      n=sc.nextInt();     
	      int arr[]=new int[n];   
	      System.out.println("Enter the elements of the array: ");
	      for(int i=0; i<n ;i++)     
	      {
	          arr[i]=sc.nextInt();
	      }
	      System.out.println("Enter the element to find the occurance: ");
	        int B=sc.nextInt();
	        int O=0;
	        for(int i=0;i<n;i++)
	        {
	          if(B==arr[i])
	         {
	                O++; 
	            }
	        }
	     System.out.println("This element occurred "+O+" times ");
	       
	       
	   }
	}
