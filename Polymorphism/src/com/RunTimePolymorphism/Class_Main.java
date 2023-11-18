package com.RunTimePolymorphism;

public class Class_Main {

	
	public static void main(String[] args) {
//		Class_Main Main = new Class_C();
		
		
		Class_A A = new Class_A();
		A.Food("Grapes");
		A.Pet("Bingo");
		
		Class_Main Main = new Class_Main();
		
		Class_A a = new Class_A();
		
		Class_B d = new Class_B();
		
		Class_C c = new Class_C();
		
		
		
	}
}
