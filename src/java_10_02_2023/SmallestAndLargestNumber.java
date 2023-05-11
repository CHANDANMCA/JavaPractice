package java_10_02_2023;

public class SmallestAndLargestNumber {
	public static void main(String[] args) {
		int[] num= {1,2,3,4,5,6,7,8,9,10};
		int smallestNumber=num[0];
		int largestNumber=num[0];

		for (int i = 0; i < num.length; i++) {
			if(num[i]>largestNumber) {
				largestNumber=num[i];

			}else if (num[i]<smallestNumber) {
				smallestNumber=num[i];
			}
		}
		System.out.println("smallest Number:"+smallestNumber);
		System.out.println("largest number:"+largestNumber);
	}

}
