package com.Constructor;

public class ThisOptionInConstructor {

//Constructor 1:
	public ThisOptionInConstructor (int a, int b) {
		this("News", 7);					// Calling Constructor 2
	System.out.println("Sum of Two numbers \t:" + (a + b));
	}
	
//Constructor 2:
	public ThisOptionInConstructor (String a, int b) {
		this("Red ", "Yellow ", "Green");	// Calling Constructor 3
		System.out.println("Channel name \t\t:"+ a + b);
	}

//Constructor 3:
	public ThisOptionInConstructor (String a, String b, String c) {
		this.movie("Jailer");				// Calling Normal Method
		System.out.println("Traffic Lights colour \t:" + a + b + c);
	}
	
//Constructor 4:
	public ThisOptionInConstructor () {
		this(52,48);						// Calling Constructor 1
		System.out.println("Java is an Object oriented programing language");
	}
	
// Normal Method
	public void movie(String SS) {
		System.out.println("Movie name \t\t:"+ SS);
	}	
	
// Main Method
	public static void main (String [] args) {
		ThisOptionInConstructor CallAll = new ThisOptionInConstructor();	// Calling Constructor 4
	}
}
