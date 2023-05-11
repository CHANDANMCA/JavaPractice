package com.java8.jodaAPI;

import java.time.LocalDate;
import java.time.LocalTime;

public class JodaApi {
	public static void main(String[] args) {
		LocalDate date=LocalDate.now();
		System.out.println(date);
		LocalTime lTime=LocalTime.now();
		System.out.println(lTime);
		System.out.println(date.getYear());
	}

}
