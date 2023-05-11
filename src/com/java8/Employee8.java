package com.java8;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class Employee8 {
	public static void main(String[] args) {
		ArrayList<Employee> list=new ArrayList<Employee>();
		list.add(new Employee("12","badal",23));
		list.add(new Employee("13","ghania",23));
		list.add(new Employee("14","litu",23));
		list.add(new Employee("15","badal",23));
		list.add(new Employee("16","ghania",23));
		Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(Employee::getName, Collectors.counting()));
		System.out.println(collect);
	}



}
