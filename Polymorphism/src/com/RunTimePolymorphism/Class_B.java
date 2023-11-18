package com.RunTimePolymorphism;
public class Class_B extends Class_A {
	
					public void Food(String fruit)	{
						System.out.println("B Edible food\t:\t"+ fruit);
					}
					
					void Pet(String Animal) {
						System.out.println("B Domestic Animal\t:\t" + Animal);
					}
	
								public static String EmptyVariable;
								
								public static void Veg(String Carrot) {
									System.out.println("B Vegetable: "+ Carrot );
								}
								
								public  void Veg() {
									System.out.println("B Veg");
								}

						public static void main(String[] args) {
// Static method		
						Veg("carrot");
						Veg(EmptyVariable);
//Object creation for Parent Class:
						Class_A a = new Class_A();
						a.Food("Apple");
						a.Pet("Cat");
//Object creation for Child Class:
						Class_B b = new Class_B();
						b.Food("Mango");
						b.Pet("Cat");
						b.Veg();
// UpCasting
						Class_A x = new Class_B();
						x.Food("Lemon");
						x.Pet("Monkey");
					}
}
