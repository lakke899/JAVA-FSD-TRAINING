package ArrayAssign;
import java.util.Scanner;
/*4.Write a program to input a String array and display it, and now to copy the elements into
another array in the reverse order and print the reverse_array elements.*/

public class ReverseArray {
	public static void main(String[] args) {
		int i=0,j=0;
		System.out.println("enter array size");
		Scanner sc = new Scanner(System.in);
		int size =sc.nextInt();
		String[] array = new String[size];
		String[] copied = new String[size];
		System.out.println("enter string values");
		for(i=0;i<size;i++) {
			array[i]=sc.next();
		}
		System.out.println("reverse array is");
		for(i=size;i>0;i--,j++) {
			copied[j] = array[i-1];
			System.out.println(copied[j]);
		}
		
	}

}
