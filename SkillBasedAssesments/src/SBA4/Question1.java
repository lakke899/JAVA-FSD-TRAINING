package SBA4;

import java.util.Scanner;

/*
 * Write a program to take an integer array from the user and give the user a choice to sort using bubble sort (or) selection sort. Sort the array elements according to the selected algorithm of the user and display the sorted array.
 */
public class Question1 {
	void bubbleSort(int array[]) {
		int n = array.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					// swap arr[j+1] and arr[j]
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
	}

	void SelectionSort(int array[]) {
		int n = array.length;
		// One by one move boundary of unsorted subarray
		for (int i = 0; i < n - 1; i++) {
			// Find the minimum element in unsorted array
			int min_idx = i;//
			for (int j = i + 1; j < n; j++) {
				if (array[min_idx] > array[j])
					min_idx = j;// 5
			}
			// Swap the found minimum element with the first element
			int temp = array[min_idx];
			array[min_idx] = array[i];
			array[i] = temp;
		}
	}

	// Prints the array
	void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array length");
		int n = sc.nextInt();
		System.out.println("enter array elements");
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("the entered array elements are : ");
		for (int i = 0; i < n; ++i) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.println("choose method");
		System.out.println("1.BubbleSort");
		System.out.println("2.Selection Sort");
		int choose = sc.nextInt();
		Question1 obj = new Question1();
		sc.close();
		if (choose == 1) {
			System.out.println("BoobleSorted array is ");
			obj.bubbleSort(array);
			obj.printArray(array);
		}
		if (choose == 2) {
			System.out.println("SelectionSorted array is");
			obj.SelectionSort(array);
			obj.printArray(array);
		}
	}
}
/*
OUTPUT
enter array length
4
enter array elements
4
5
2
3
the entered array elements are : 
4 5 2 3 
choose method
1.BubbleSort
2.Selection Sort
1
BoobleSorted array is 
2 3 4 5 


enter array length
4
enter array elements
2
7
3
9
the entered array elements are : 
2 7 3 9 
choose method
1.BubbleSort
2.Selection Sort
2
SelectionSorted array is
2 3 7 9 
*/