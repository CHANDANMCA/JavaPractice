package java_23_12_2022;

public class SecondLargestArrayNumber {
	public static void main(String[] args) {
		int[] array= {12,43,55,67,33,68};
		System.out.println(secondLargestNumber(array));

	}
	public static int secondLargestNumber(int[] num) {

		int highestNumber=Integer.MIN_VALUE;
		int secodHighestNumber=Integer.MIN_VALUE;
		for(int i:num) {
			if(i>highestNumber) {
				secodHighestNumber=highestNumber;
				highestNumber=i;
			}else  if(i>secodHighestNumber){
				secodHighestNumber=i;
			}
		}
		return secodHighestNumber;
	}

}
