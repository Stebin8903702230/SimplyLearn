package com.Print;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {
	// Java program to demonstrate working of SimpleDateFormat

//	import java.text.ParseException;
//	import java.text.SimpleDateFormat;
//	import java.util.Date;


		public static void main(String args[]) throws ParseException { 
		
			// Formatting as per given pattern in the argument
			SimpleDateFormat ft
				= new SimpleDateFormat("dd-MM-yyyy");
			SimpleDateFormat ft2
			= new SimpleDateFormat("yyyy-dd-MM");
			String str = ft.format(new Date());
			String str2 = ft2.format(new Date());
			System.out.println("Formatted Date : " + str);
			System.out.println("Formatted Date2 : " + str2);
			// parsing a given String
			str = "02/18/1995";
			ft = new SimpleDateFormat("MM/dd/yyyy");
			Date date = ft.parse(str);

			// this will print the date as per parsed string
			System.out.println("Parsed Date : " + date);
		}
	

}
