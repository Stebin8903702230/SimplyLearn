package com.ExceptionTypes;

public class ArithmeticException {
	public static void main (String[] args) throws Exception {
	      int a=5;
	      int b=0;
	      int c=a*b;
	      System.out.println(c);
	        try{
	          System.out.println(a/b);
	  /*      int i = computeDivision(a, b);
	          System.out.println(i);*/
	        }
	      catch(Exception e){
	        e.printStackTrace();  //java.lang.ArithmeticException: / by zero at com.ExceptionTypes.ArithmeticException.main(ArithmeticException.java:8)
	    	System.out.println("\n\n");
	        
	    	System.out.println(e.toString());	//java.lang.ArithmeticException: / by zero
	        System.out.println("\n\n");
	       
	        System.out.println(e.getMessage());		// by zero
	        System.out.println("\n\n");

	      }
	    }
}
