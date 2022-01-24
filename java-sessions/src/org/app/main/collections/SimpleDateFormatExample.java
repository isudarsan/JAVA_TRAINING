package org.app.main.collections;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SimpleDateFormatExample {

	public static void main(String[] args) {

		
		// yyyy-MM-dd -> 2022-00-26
		// yyyy/MM/dd -> 2022/00/26	
				
		
			
//		String dateString1 = "2022-01-24";
//		String dateString2 = "2022/01/26";
//		
//		
//		
//		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//		SimpleDateFormat dateFormat2 = new SimpleDateFormat("yyyy/MM/dd");
		
		//try {
//			Date date1 = dateFormat.parse(dateString1);
//			System.out.println(date1);
//			Date date2 = dateFormat2.parse(dateString2);
//			System.out.println(date2);
			
			
//			int val = date1.compareTo(date2);
//			
//			System.out.println(val);
//			
//			
//			if(val == 0) {
//				System.out.println("Date 1 and Date 2 are equal");
//			}else if(val > 0) {
//				System.out.println("Date 1 comes afte Date2");
//			}else if(val < 0) {
//				System.out.println("Date 1 comes before Date2");
//			}
			
			
			
			//System.out.println(date1.before(date2));
			//System.out.println(date2.after(date1));
			
			
			
			
			
			
//			
//			
//		}catch(ParseException e) {	
//			e.printStackTrace();
//		}
		
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(1986, 07, 14);
		
		Date dob = calendar.getTime();
		
		System.out.println("Date of Birth : "+dob);
		
		// 14/08/1986
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		String dateOfBirthString = dateFormat.format(dob);
		System.out.println(dateOfBirthString);
		
		
		
		
		
		
		
	}

}
