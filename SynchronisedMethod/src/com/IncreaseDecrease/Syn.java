package com.IncreaseDecrease;

public class Syn {
	 public static void main(String[] args) {
		 CountAddSub counter = new CountAddSub();

	        Thread t1 = new Thread(() -> {
	            for (int i = 0; i < 10000; i++) {
	                counter.increment();
	            }
	        });

	      /*  Thread t2 = new Thread(() -> {
	            for (int i = 0; i < 10000; i++) {
	                counter.decrement();
	            }
	        });		*/

	        t1.start();
	  //      t2.start();

	        try {
	            t1.join();
	   //         t2.join();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        
	        System.out.println("Count: " + counter.getCount());
	    }

}
