package com.ExceptionTypes;

public class UncheckedRunTime {
	
	String s ;
	
	public void nullPointerExcep() {
		System.out.println(s.length());		// If we try to use functions for a null value.
	}
	
	public void stringIndexOutOfBounds() {
		String name = "Michel";
		System.out.println(name.charAt(6)); // String index out of range
	}
	
	public void ArrayIndexOutOfBounds() {
	/*	String[] names = {"George", "Phelan"};
		System.out.println(names[3]);		// Index 3 out of bounds for length 2		*/
		//		or
		String names[] = new String[2];
		names[0] = "George";
		names[1] = "Phelan";
		System.out.println(names[3]);		// Index 3 out of bounds for length 2
		for (int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
	}
	
	public void arrithmeticExp() {
		int a= 10;
		int b= 20;
		int x= 0;
		int c= a+b; int d= a*b; int e= b/a; double f = a/b;// double g=b/x;  //  any value divided by zero is Infinity
			System.out.println(c+" "+d+" "+e + " " + f);
		//	System.out.println(g);
				   try{ 
					   double h=b/x; 
					   System.out.println(h);
				        }catch(Exception e1){
				        	System.out.println(e1);
				        	}  
				   //rest code of the program   
				   System.out.println("rest of the code...");  
				  }  
				  
	
	
	public void numberFormatExcep() {
		String f = ".100";
		int g = Integer.parseInt(f);	// convert string into Integer.
		System.out.println(g);
	}
	
	
	
		public static void main(String[] args) {
			UncheckedRunTime x = new UncheckedRunTime();
		//	x.nullPointerExcep();
		//	x.stringIndexOutOfBounds();
		//	x.ArrayIndexOutOfBounds();
			x.arrithmeticExp();
//			x.numberFormatExcep();
			
		}
}