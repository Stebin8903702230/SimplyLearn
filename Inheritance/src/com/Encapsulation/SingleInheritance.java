package com.Encapsulation;

public class SingleInheritance extends Parent {

	public void Child1() {
		System.out.println("Masha");
	}
	private void Child2() {
		System.out.println("Dora");
	}
	protected void Child3() {
		System.out.println("Bujji");
	}
	void Child4() {
		System.out.println("Tarzon");
	}
		
			public static void main (String[] args) {
				Parent d = new Parent();
				d.Green();				d.Vehicle1();
				// Red- Protected mode	// Child2 - Protected mode
				d.Yellow();				d.Vehicle3();
				d.Blue();				d.Vehicle4();
				System.out.println("=================");
				
				SingleInheritance E = new SingleInheritance();
				E.Child1();
				E.Child2();
				E.Child3();
				E.Child4();
				
				System.out.println();
				E.Green();				E.Vehicle1();
				E.Yellow();				E.Vehicle3();
				E.Blue();				E.Vehicle4();
				
			}
}
