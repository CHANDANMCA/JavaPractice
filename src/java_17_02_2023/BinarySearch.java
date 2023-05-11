package java_17_02_2023;

public class BinarySearch {

	public static void binarySearch( int[] arr,int start, int last, int key) {
		int mid=(start+last)/2;
		while(start<=last) {
			if(arr[mid]<key	) {
			start=mid+1;
			}else if (arr[mid]==key) {
				System.out.println("Element found index:"+mid);
			}
			else  {
				last=mid-1;

			}
			mid=(start+last)/2;
		}

	}


	public static void main(String[] args) {

	}

}
