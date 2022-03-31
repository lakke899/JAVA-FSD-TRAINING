package DataStructures;
//Java program for implementation of Bubble Sort

/*public class BubbleSort {
	void bubbleSort(int array[]) {
		int n = array.length;
		for(int i=0; i<n-1;i++) {
			for(int j=0; j<n-i-1;j++) {
				if(array[j]>array[j+1]) {
					int temp = array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
					
				}
			}
			// for debugging every move made by the algorithm
			for (int k=0; k<n; ++k)
			{
				System.out.print(array[k]+",");
			}
				System.out.println(""); 
		}//inner for closes
		}
		/* Prints the array */
	
	/*void printArray(int array[]) {
		int n = array.length;
		for(int i=0;i<n;++i) {
			System.out.print(array[i]+" ");
			
		}
	}
	// Driver method to test above
	public static void main(String[] args) {
		BubbleSort obj = new BubbleSort();
		int array[]= {64,34,25,12,22,11,90};//size=7
		obj.bubbleSort(array);
		System.out.println("Sorted Array");
		obj.printArray(array);
	}

}*/
public class BubbleSort
{
	void bubbleSort(int arr[])
	{ 
		int n = arr.length; 
		for (int i = 0; i < n-1; i++) 
			for (int j = 0; j < n-i-1; j++) 
			{
				if (arr[j] > arr[j+1])
				{
					// swap arr[j+1] and arr[j]
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
				//for debugging every move made by the algorithm
				for (int k=0; k<n; ++k)
				{
					System.out.print(arr[k]+",");
				}
					System.out.println("");
			}//inner for closes
	}

	// Prints the array 
	void printArray(int arr[])
	{
		int n = arr.length;
		for (int i=0; i<n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	// Driver method to test above
	public static void main(String args[])
	{
		BubbleSort ob = new BubbleSort();
		int arr[] = {64, 34, 25, 12, 22, 11, 90};//size=7
		ob.bubbleSort(arr);
		System.out.println("Sorted array");
		ob.printArray(arr);
	}
}
