package java_23_12_2022;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SpecificDateFormat {
	public static void main(String[] args) {
		String date = "MM-dd-yyyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(date);
		String format = simpleDateFormat.format(new Date());
		System.out.println(format);
	}

}
