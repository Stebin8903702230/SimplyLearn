package com.August04;

public class Agelimits {

		public void ifTest() 
			{
			int age = 3;
					
			if((age >= 18) && (age <= 100))	
				{
				System.out.println("Major");
				}
			else if((age >= 1) && (age <= 5)) 
				{
				System.out.println("Child");
				}
			else if((age >= 6) && (age <= 17)) 
				{
				System.out.println("Minor");
				}
			else 
				{
				System.out.println("Invalid age");
				}
			}
		
		public static void main(String[] args) {
			Agelimits b = new Agelimits();
			b.ifTest();
		}
}
