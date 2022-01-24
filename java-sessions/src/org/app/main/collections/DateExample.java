/**
 * 
 */
package org.app.main.collections;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author sudarsanpro
 *
 */


public class DateExample {

	public static void main(String args[]) {

		// A date can be created in two ways, by invoking the default constructor or
		// by passing milliseconds to the long parameter constructor.

//		Date date = new Date();
//
//		System.out.println("The Date is : " + date);
//
//		long val = date.getTime();
//
//		System.out.println(val);
//
//		Date date1 = new Date(1642997787875L);
//		System.out.println(date1);
		
	
		
//		GregorianCalendar calendar = new GregorianCalendar(2022, 00, 24);		
//		Date date = calendar.getTime();		
//		System.out.println(date);
//		
		
		
	
		
		// Month starts from zero (0) , JAN -0 , FEB - 1, ... DEC - 11
		Calendar calendar2 = Calendar.getInstance();
		calendar2.set(2022, 00, 26);		
		Date date1 = calendar2.getTime();		
		System.out.println(date1);
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(2022, 00,27);
		Date date2 = calendar.getTime();
		System.out.println(date2);
		

		
		
		
		
		
		
		
		
		
		

	}
}
