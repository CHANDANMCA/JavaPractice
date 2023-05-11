package java_22_02_2023;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class MainPersion {
	public static void main(String[] args) {

		ArrayList<Persion> arrayList =new ArrayList<Persion>();
		arrayList.add(new Persion(1,"chandan","cks25ab@gmail.com",20000,"IT"));
		arrayList.add(new Persion(2,"adhir","adhir@gmail.com",25000,"HR"));
		arrayList.add(new Persion(3,"anil","anil@gmail.com",16000,"IT"));
		arrayList.add(new Persion(4,"badal","badal@gmail.com",1400,"HR"));
		Map<String, Persion> collect = arrayList.stream().collect(Collectors.groupingBy(e->e.getDepartment() ,Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(e->e.getSalary())), Optional::get)));


	System.out.println(collect);
	}

}
