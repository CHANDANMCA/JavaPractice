package java_26_02_2023;

import java.util.ArrayList;
import java.util.Arrays;

public class PersionMain {
	public static void main(String[] args) {

		ArrayList<Persion> arrayList=new ArrayList<Persion>();
		arrayList.add(new Persion(1,"chandan","cks25ab@gmail.com"));
		arrayList.add(new Persion(2,"badal","badal@gmail.com"));
		arrayList.add(new Persion(3,"anil","anil@gmail.com"));
		arrayList.add(new Persion(4,"prakash","prakash@gmail.com"));
		boolean allMatch = Arrays.asList(1,3,5,7,9).stream().allMatch(x->x%2==1);
		System.out.println(allMatch);

		arrayList.stream().filter(x->x.getName().startsWith("b")).forEach(System.out::println);;
	}

}
