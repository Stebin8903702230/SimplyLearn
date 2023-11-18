package com.Interface;

public class Detailing implements Specification, Performance {
	
// Interface
	
	@Override
	public void Brand() {
		System.out.print("Brand Name \t:");
	}
	
	@Override
	public void ModelName() {
		System.out.print("Model Name \t:");		
	}
	
	@Override
	public void Year() {
		System.out.print("Year \t\t:");		
	}
	
	@Override
	public void Milege() {
		System.out.print("Milege \t\t:");		
	}

	@Override
	public void EngineCC() {
		System.out.print("Engine CC \t:");		
		
	}

	@Override
	public void Weight() {
		System.out.print("Weight \t\t:");		
		
	}
	
			public static void main (String [] args) {
				Detailing D = new Detailing();
				D.Brand();									System.out.println();
				D.ModelName();								System.out.println();
				D.Year();									System.out.println();
				D.Milege();									System.out.println();
				D.EngineCC();								System.out.println();
				D.Weight();									System.out.println();
			}
}
