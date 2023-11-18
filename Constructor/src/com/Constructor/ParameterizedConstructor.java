package com.Constructor;

public class ParameterizedConstructor {
//public ParameterizedConstructor() {			- Default Constructor or Non-Parameterized Constructor
	
//Constructor 1:
			public ParameterizedConstructor (int a, int b) {
			System.out.println("Sum of Two numbers \t:" + (a + b));
			}
			
// Constructor 2:
			public ParameterizedConstructor (String a, int b) {
				System.out.println("Satellite name \t\t:"+ a + b);
			}

// Constructor 3:
			public ParameterizedConstructor (String a, String b, String c) {
				System.out.println("Volume of tank \t\t:" + a + b + c);
			}
			
/* Normal Method
				public void movie(String SS) {
					System.out.println("Movie name \t:"+ SS);
				}
*/			
// Main Method
				public static void main (String [] args) {
					ParameterizedConstructor ABC = new ParameterizedConstructor(2,5);
					ParameterizedConstructor AB  = new ParameterizedConstructor("Chandrayan", 3);
					ParameterizedConstructor A   = new ParameterizedConstructor("Length", "Breadth", "Height");
										
	/*				ParameterizedConstructor l = new ParameterizedConstructor();
						l.movie("Jailer");
						[ Cannot be executed since the default constructor deleted automatically ]
	*/
				}
}


