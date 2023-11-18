package com.Strings;

public class StringTypes {
	/* 4 Types
	1, Literal
	2, Non Literal
	3, Buffer
	4, Builder				*/
	
	public static void main (String [] args) {
	String name = "Stebin";					// String Literal
	
	String name1 = new String ("Stebin");	// String Non-Literal
		
	System.out.println(name);
	System.out.println(name1);
	
	System.out.println(name == "Stebin");
	System.out.println(name1 == "Stebin");	// name1 considered as an new Object.
	System.out.println(name == name1);		// name1 considered as an new Object.
	
	System.out.println(name1.equals(name));
	System.out.println(name1.equals("Stebin"));
	
	System.out.println(name.equals(name1));
	
	System.out.println(name.toUpperCase());
	System.out.println(name1.toUpperCase());
	System.out.println(name.length());
	System.out.println(name1.length());
	}
	

}
