package SBA3;

import SBA4.Question2;

//Write a program to implement insertion sort.
public class Question4 {
	void sort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i) {
			int temp = arr[i];
			int j = i - 1;

			/*
			 * Move elements of arr[0..i-1], that are greater than key, to one position
			 * ahead of their current position
			 */
			while (j >= 0 && arr[j] > temp) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = temp;
		}
	}

	/* A utility function to print array of size n */
	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");

		System.out.println();
	}

	// Driver method
	public static void main(String args[]) {
		int arr[] = { 12, 11, 13, 5, 6 };

		Question2 ob = new Question2();
		ob.sort(arr);
		System.out.println("Sorted array is");
		printArray(arr);
	}

}
/*
output
Sorted array is
5 6 11 12 13 
*/