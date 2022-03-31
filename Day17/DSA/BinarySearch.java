package DSA;
//using recurssion
public class BinarySearch {
	public static int binarySearch(int arr[],int first,int last,int key) {
		if(last>=first) {
			int mid =(first+last)/2;
			if(arr[mid]==key) {
				return mid;
			}
			if(arr[mid]>key) {
				return binarySearch(arr,first,mid-1,key);//search in left subarray
			}
				else {
					return binarySearch(arr,mid+1,last,key);//search in right subarray  
				}
			}
		return -1;
		}
	

	public static void main(String[] args) {
		int arr[]= {4,6,8,10,12,14,16};
		int key=8;
		int last=arr.length-1;
		int result=binarySearch(arr,0,last,key);
		if(result==-1)
			System.out.println("element is not found");
		else
			System.out.println("element is found at index: "+result);
	}

}
