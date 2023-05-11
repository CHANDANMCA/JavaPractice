package java_23_02_2023;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormate {
	public static void main(String[] args) {
String dateString="dd/MM/YYYY";
String simpleDateFormate=new SimpleDateFormat(dateString).format(new Date());
System.out.println(simpleDateFormate);

	}
}
