package com.ExceptionTypes;

public class CheckedCompileTime {
		
		public void interruptedExcemption() throws InterruptedException {
			Thread.sleep(3000);	//for 3 milliseconds delay execution
			System.out.println("Interrupted Excemption(unhandled exception type in java.lang) ");
		}
		
		public void ExcemptionHandling() {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				System.out.println("Interrupted Excemption(by Try-Catch Method, if try succeeds) ");
				e.printStackTrace();
			} finally {
				System.out.println("Interrupted Excemption(by Try-Catch-finally Method, if try succeeds or fails) ");
			}
			
		}
			public static void main (String[] args) throws InterruptedException {
				CheckedCompileTime CCT = new CheckedCompileTime();
				CCT.interruptedExcemption();
				CCT.ExcemptionHandling();
				
			}
}
