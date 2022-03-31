package DSA;
public class LinearSearch {
	public static int linearSearch(int arr[],int n,int val) {
		// Going through array sequencially
		for(int i=0;i<n;i++) {
			if(arr[i]==val)
				return i+1;
		}
		return -1;
	}
public static void main(String[] args) {
	int arr[]= {55,29,10,40,57,41,20,24,45}; // given array
	int val=10; // value to be searched
	int n=arr.length;//size of array
	int res = linearSearch(arr,n,val);//store result
	if(res==-1)
		System.out.println("Element is not present in the array");
	else
		System.out.println("element is present at "+res+" position of array");
	
	}
}
