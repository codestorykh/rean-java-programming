package com.learningjava;

import java.util.Calendar;
import java.util.Date;

public class DateMonth {

	public static void main(String[] args) {
		
		Date date= new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		int month = cal.get(Calendar.MONTH);
		if(month == 9) {
			System.out.println(month);
		}
		
	}
}
