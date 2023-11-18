package com.Constructor;

public class ThisOptionInMethods {
	
	
		public void Sum(int a,int b) {
			
			System.out.println((a+b));
											this.Percentage(25,50);
		}
		
		public void Average(int a,int b, int c, int d) {
			
			System.out.println((a+b+c+d)/4);
		}
		
		public void Percentage(double a,float b) {
			
			System.out.println((a/b)*100);
											this.Average(2,4,6,8);
		}
		
	public static void main (String [] args) {
		ThisOptionInMethods f = new ThisOptionInMethods();
		f.Sum(12, 18);
	}
}


