package com.August04;
		// class
public class Agecalctn {
	
		// method
	public void ifTest() 
		{
		int age = 99;
				
		if((age >= 18) && (age <= 100))	
			{
			System.out.println("Major");
			}
		else if((age >= 1) && (age <= 17)) 
			{
			System.out.println("Minor");}
		else 
			{
			System.out.println("Invalid age");
			}
		}
	
	public static void main(String[] args) {
		Agecalctn c = new Agecalctn();
		c.ifTest();
	}
}
