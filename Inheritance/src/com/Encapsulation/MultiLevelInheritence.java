package com.Encapsulation;

public class MultiLevelInheritence extends SingleInheritance {
	
	/*	Level 1	- Parent 						-	initiated Encapsulation
		Level 2 - Parent to Child				-	Single Inheritance
		Level 3 - Parent to Child to Grand Child-	Multiple Inheritance
	*/
				public static void main (String[] args) {
					MultiLevelInheritence m = new MultiLevelInheritence();
					
					m.Vehicle1();
					m.Vehicle3();
					m.Vehicle4();
					
					m.Green();			m.Child1();
					m.Yellow();			m.Child3();
					m.Blue();			m.Child4();
				}
}
