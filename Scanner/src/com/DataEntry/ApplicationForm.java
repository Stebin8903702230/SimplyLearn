package com.DataEntry;

import java.util.Scanner;

public class ApplicationForm {
			String Name;
			int age;
			char sex;
			Long Mobile;
		
	Scanner  S = new Scanner(System.in);
		
	public void Student () {
		System.out.print("Enter your name : ");
		Name = S.next();
		
		System.out.print("Enter Your age : ");
		age		= S.nextInt();
		
		System.out.print("Enter your sex(M/F) : ");
		sex	= S.next().charAt(0);
		
		System.out.println();
	}
	
	public void Details() {
		System.out.println("Enter your address : ");
		String Address = S.next(); 
		String Address2 = S.nextLine();
		String Address3 = S.nextLine();
		
		System.out.print("Enter your mobile number : ");
		Mobile = S.nextLong();
		
		System.out.println();	

		System.out.println("Enter your name : "+ Name);
		System.out.println("Enter Your age : " + age);
		System.out.println("Enter your sex(M/F) : "+ sex);
		System.out.println("Enter your address : "+ Address+ Address2 +Address3);
		System.out.println("Enter your mobile number : " + Mobile);			
	}
	
	public static void main(String[] args) {
		ApplicationForm AF = new ApplicationForm();
		AF.Student();
		AF.Details();
	}
}
