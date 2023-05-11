package java_17_02_2023;

public class LinearSearch {

	public static int linearSearch(int[] arr, int key) {

		for(int i=0;i<arr.length;i++) {
			if (arr[i]==key) {
				 return i;
			}
		}
		return -1 ;
	}

	public static void main(String[] args) {
int[] arr= {12,43,55,86};
int key=33;
System.out.println(linearSearch(arr, key));



	}

}
