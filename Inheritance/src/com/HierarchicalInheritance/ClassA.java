package com.HierarchicalInheritance;

import com.Encapsulation.Parent;

public class ClassA extends Parent {

/*Single Parent and Multiple Children
 							children1 - ClassA
 							Children2 - ClassB	*/
	
				public static void main (String[] args) {
					ClassA n = new ClassA();
					n.Vehicle1();
					n.Vehicle3();
				//	n.Vehicle4(); Since Default
					
					n.Green();						System.out.println();
				//	n.Red();	Since Protected
					n.Yellow();						System.out.println();
				//	n.Blue();	Since Default		
				}	
}
