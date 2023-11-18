package com.SingleInheriTest;

public class ClassB extends ClassA {
	public void childClass() {
		System.out.println("Child Class");
	}
	
	public static void main (String[] args) {
		ClassB b = new ClassB();
		b.parentClass();
		b.childClass();
	}
}

