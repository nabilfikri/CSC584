//Filename: GregorCal.java 

import java.util.*;
import java.text.*;

public class GregorCal {
	public static void main(String[] args) {

		GregorianCalendar cal = new GregorianCalendar();

		System.out.println("Year: " + cal.get(Calendar.YEAR));
		System.out.println("Month: " + cal.get(Calendar.MONTH));
		System.out.println("Date: " + cal.get(Calendar.DATE));
		System.out.println();

		System.out.println("Days of year: " + cal.get(Calendar.DAY_OF_YEAR));
		System.out.println("Days of month: " + cal.get(Calendar.DAY_OF_MONTH));

		System.out.println("Week of year: " + cal.get(Calendar.WEEK_OF_YEAR));
		System.out.println("Week of month: " + cal.get(Calendar.WEEK_OF_MONTH));
		System.out.println();

		System.out.println("Hour: " + cal.get(Calendar.HOUR));
		System.out.println("Minute: " + cal.get(Calendar.MINUTE));
		System.out.println("Second: " + cal.get(Calendar.SECOND));
		System.out.println();

		Date date = new Date();
		System.out.println(date); //op: Tue May 08 10:36:27 SGT 2012

		SimpleDateFormat sdf = new SimpleDateFormat("dd");
		System.out.println(sdf.format(date));

		sdf = new SimpleDateFormat("dd/MM/yy");
		System.out.println(sdf.format(date));

		sdf = new SimpleDateFormat("MMM dd, yyyy");
		System.out.println(sdf.format(date)); //op: May 08, 2012

		sdf = new SimpleDateFormat("E MMM dd yyyy");
		System.out.println(sdf.format(date));

		sdf = new SimpleDateFormat("dd MM yyyy hh:mm:ss zzz");
		System.out.println(sdf.format(date)); //op: 08 05 2012 10:36:27 SGT

		sdf = new SimpleDateFormat("hh:mm:ss");
		System.out.println(sdf.format(date));
	}
}