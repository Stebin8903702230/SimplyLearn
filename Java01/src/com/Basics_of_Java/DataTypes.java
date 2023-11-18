package com.Basics_of_Java;

public class DataTypes {
	
		public void primitive_Data_Type() {
			byte number = 10;					System.out.println(number);		// 1 byte	= 8 bit ; values are -128 to 127;
			
			short number03 = 32000;				System.out.println(number03);	// 16 bit	= values from -32,768 to 32,767;
			
			int number01 = 123456789;			System.out.println(number01);	// 32 bit	= values from -2,147,483,648 to 2,147,483,647;
			
			long number02 = 12345678910111213L;	System.out.println(number02);	// 64 bit	= values from 2^-63 to 2^63-1;
			
			double number04 = 100.00;			System.out.println(number04); 	// 64  bit
				
			float percentage = 75.00f;			System.out.println(percentage); // 32 bit
					
			char alphabet = 'a';				System.out.println(alphabet); 	// 16 bit
			
			boolean TrueFalse = false;			System.out.println(TrueFalse); 	// 1 bit
		}
		
		public void nonprimitive_Data_Type(){
			String name = "Stebin";				System.out.println(name);
//			Array
		}

		public static void main(String[] args) {
			DataTypes a = new DataTypes();
			a.primitive_Data_Type();
			a.nonprimitive_Data_Type();
		}
}
