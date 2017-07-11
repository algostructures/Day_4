package Collections;

import java.util.*;

public class DateExample {

	public static void main(String args[])
	{
		Date d3 = new Date();
		System.out.println("Todays Date time is"+d3);
		
		Date d2 = new Date();
		
		Date d1 = new Date(1443060220000l); //unix time stamp in milliseconds
		System.out.println("Sample Date time is"+d1);
		
		System.out.println(d1.toString());
		System.out.println(d2.toString());
		long diff = d2.getTime() - d1.getTime();
		long diffSeconds = diff / 1000;
		long diffMinutes = (diff / (60 * 1000));
		long hrs = diffMinutes/60;
		long days = hrs/24;
		System.out.println(days+"  days");
		System.out.println(hrs+"  hrs");
		System.out.println(diffMinutes+"  min");
		System.out.println(diffSeconds+"  sec");
	}
}
