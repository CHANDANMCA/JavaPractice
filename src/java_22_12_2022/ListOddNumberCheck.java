package java_22_12_2022;

import java.util.Arrays;
import java.util.List;

public class ListOddNumberCheck {
	public static void main(String[] args) {
;
System.out.println(checkOddNumber(Arrays.asList(55,57,53,51)));
	}

	public	 static boolean checkOddNumber(List<Integer> list) {
//		for(int i:list) {
//			if(i%2==0) {
//				return false;
//			}
//		}
//		return true;
	return	list.parallelStream().anyMatch(x->x%2!=0);
	}

}
