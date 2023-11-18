package com.RunTimePolymorphism;

public class Class_A {

			public void Food(String fruit)	{
				System.out.println("A Edible food\t:\t"+ fruit);
			}
			
			void Pet(String Animal) {
				System.out.println("A Domestic Animal\t:\t" + Animal);
			}
			
			
			public static void main(String[] args) {
				Class_A a = new Class_A();
				a.Food("Apple");
				a.Pet("Dog");
			}
}
