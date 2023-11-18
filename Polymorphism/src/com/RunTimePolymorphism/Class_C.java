package com.RunTimePolymorphism;

public class Class_C extends Class_B {
					
					public void Food(String fruit)	{
						System.out.println("C Edible food\t:\t"+ fruit);
					}
					
					void Pet(String Animal) {
						System.out.println("C Domestic Animal\t:\t" + Animal);
					}
				
								public static String Variable = "xyz";
								
								public static void Work(String Changable) {
									System.out.println("C Vegetable: "+ Changable );
								}
								
								public  void Work() {
									System.out.println("C Work");
								}
				
						public static void main(String[] args) {
							//Static method	
									Veg(Variable);
									Veg("Brinjal");
									Work("carrot");
									Work(Variable);
							//Object creation for Parent Class:
									Class_A a = new Class_A();
									a.Food("Apple");
									a.Pet("Cat");
							//Object creation for Child Class:
									Class_B b = new Class_B();
									b.Food("Mango");
									b.Pet("Cat");
									b.Veg();
							//UpCasting
									Class_A x = new Class_B();
									x.Food("Lemon");
									x.Pet("Monkey");
					}


}
