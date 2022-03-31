package DataStructures;
//Java program for implementation of Selection Sort
/*public class SelectionSort {
	void sort(int array[]) {
		int n= array.length;//6
		// One by one move boundary of unsorted subarray
		for (int i=0;i<n-1;i++) {
			// Find the minimum element in unsorted array
			int min_idx=i;
			for(int j = i+1;j<n;j++) {
				if(array[min_idx]>array[j]) {
					min_idx=j;
					
				}
				// Swap the found minimum element with the first element
				int temp = array[min_idx];
				array[min_idx] = array[i];
				array[i] = temp;
				
				for (int k=0; k<n; ++k)
				{
					System.out.print(array[k]+" ");
				}
				System.out.println();  

			}
			}
		}
	// Prints the array
	void printArray(int array[]) {
		int n= array.length;
		for (int i=0;i<n;++i) {
			System.out.print(array[i]+ " ");
		}
	}
	// Driver code to test above
	public static void main(String[] args) {
		SelectionSort obj = new SelectionSort();
		int array[]= {5,3,9,4,7,8};
		obj.sort(array);
		System.out.println("Sorted array");
		obj.printArray(array);
	}

}*/
class SelectionSort
{
	void sort(int arr[])
	{  			//1,2,3,4,6,9	
		int n = arr.length; //6

		// One by one move boundary of unsorted subarray
		for (int i = 0; i < n-1; i++) 
		{
			// Find the minimum element in unsorted array
			int min_idx = i;//
			for (int j = i+1; j < n; j++) 
				{
					if (arr[min_idx] > arr[j])
					min_idx = j;//5
			}

			// Swap the found minimum element with the first
			// element
			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp; /*
			for (int k=0; k<n; ++k)
			{
				System.out.print(arr[k]+" ");
			}
			System.out.println();  */

		}

	}

	// Prints the array
	void printArray(int arr[])
	{
		int n = arr.length;
		for (int i=0; i<n; ++i)
			System.out.print(arr[i]+" ");
		System.out.println();
	}

	// Driver code to test above
	public static void main(String args[])
	{
		SelectionSort ob = new SelectionSort();
		int arr[] = {5,3,9,4,7,8};
		ob.sort(arr);
		System.out.println("Sorted array");
		ob.printArray(arr);
	}
}

