package com.accessSpecifier1;

import Encapsulation.CommonClass;

public class PackNewClass3 extends CommonClass {
		int g = 234;


	public static void main (String[] args) {
		CommonClass r	= new CommonClass();
		
		PackNewClass3 j = new PackNewClass3();
		
		j.studentID();	
		{
			System.out.println(j.g);
		}
		j.studentContact();
		System.out.println();
		{
			System.out.println(r.Address);
		}
	}
	
}
