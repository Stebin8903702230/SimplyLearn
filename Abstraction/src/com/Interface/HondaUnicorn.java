package com.Interface;

public class HondaUnicorn extends Detailing {

			public void Honda() {
				System.out.println("Honda");
			}
			
			public void Name() {
				System.out.println("Honda Unicorn");
			}
			
			public void year() {
				System.out.println(2008);
			}
			
			public void KMPL() {
				System.out.println("60 KMPL");
			}
			
			public void Engine() {
				System.out.println("125 cc");
			}
			
			public void weight() {
				System.out.println("180 KG");
			}
			
		public static void main (String [] args ) {
			// UpCasting								// Normal Object creation
			Detailing k = new HondaUnicorn();		HondaUnicorn bike = new HondaUnicorn();
			k.Brand();								bike.Honda();
			k.ModelName();							bike.Name();
			k.Year();								bike.year();
			k.Milege();								bike.KMPL();
			k.EngineCC();							bike.Engine();
			k.Weight();								bike.weight();
		}
}
