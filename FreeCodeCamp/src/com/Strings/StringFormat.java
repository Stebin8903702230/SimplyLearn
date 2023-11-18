package com.Strings;

public class StringFormat {
	
	public static void main (String[] args) {

		String name = "Stebin";		// %s
		String place = "Nagercoil";
		int age = 30;				// %d
	/*	double/float				// %f
	 	char						// %c
	 	boolean						// %b
	 */
		String StringFormatted = String.format("My name is %s. I'm from %s . I'm %d years old.", name, place, age);
		System.out.println(StringFormatted);
		
		// or
		
		System.out.print(String.format("My name is %s. I'm from %s . I'm %d years old.", name, place, age));
	}
}
