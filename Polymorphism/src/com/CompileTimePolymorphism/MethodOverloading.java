package com.CompileTimePolymorphism;

public class MethodOverloading {
			
		//	Different method but same variable name.
	
			public void Train (int number) {						// Adding parameters
				System.out.println("Train number \t:"+ number);
			}
			
			public void Train (int number, String name) {			// Adding multiple parameters
				System.out.println("Train number \t:" + number);
				System.out.println("Train name \t:" + name);
			}
			
		/*	public void Train (int number, String name) {			// Same Data-type order cannot be same.
				System.out.println("Train number \t:" + number);	// Multiple Data-type can be used.	
				System.out.println("Train name \t:" + name);
			}
		*/	
			public void Train (String name, int number) {			// Changing the order of the parameters.
				System.out.println("Train name \t:" + name + "\n" +"Train number \t:" + number);
			}
			
			
		public static void main (String[] args) {
			MethodOverloading passenger = new MethodOverloading();
			passenger.Train(12633);
			passenger.Train(16823, "Ananthapuri");
			passenger.Train("Guruvayur EXP", 16127);
		}
}
