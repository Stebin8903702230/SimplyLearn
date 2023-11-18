package com.Encapsulation;

public class Parent {
	
		public void Green () {
			System.out.print("Public"+"\t\t"+ ": ");
		}
		private void Red () {
			System.out.print("Private"+"\t\t"+ ": ");
		}
		protected void Yellow () {
			System.out.print("Protected"+"\t"+ ": ");
		}
		void  Blue () {
			System.out.print("Default"+"\t\t"+ ": ");
		}
		
		public void Vehicle1() {
			System.out.println("Car");
		}
		private void Vehicle2() {
			System.out.println("Bus");
		}
		protected void Vehicle3() {
			System.out.println("Bike");
		}
		void Vehicle4() {
			System.out.println("Lorry");
		}
		

		
		public static void main (String[] args) {
			Parent l = new Parent ();
			l.Green();		System.out.println("Circle");
			l.Red();		System.out.println("Square");
			l.Yellow();		System.out.println("Diamond");
			l.Blue();		System.out.println("Triangle");
			
			System.out.println("========================");
			
			l.Vehicle1();
			l.Vehicle2();
			l.Vehicle3();
			l.Vehicle4();
		}
}


