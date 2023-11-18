package com.HierarchicalInheritance;

import com.Encapsulation.Parent;

public class ClassB extends Parent {
		
	public static void main (String[] args) {
		ClassB k = new ClassB ();
		
		k.Green();					System.out.println();
		k.Yellow();					System.out.println();
		
		System.out.println("========================");
		
		k.Vehicle1();
		k.Vehicle3();
		
	}

}
