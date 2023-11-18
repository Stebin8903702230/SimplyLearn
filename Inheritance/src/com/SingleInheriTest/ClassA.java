package com.SingleInheriTest;

public class ClassA {
		public void parentClass() {
			System.out.println("Parent Class");
		}
		
		public static void main (String[] args) {
			ClassA a = new ClassA();
			a.parentClass();
		}
}
