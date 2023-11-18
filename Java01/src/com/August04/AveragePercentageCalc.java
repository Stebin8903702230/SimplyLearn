package com.August04;

import java.util.Scanner;

public class AveragePercentageCalc {

	@SuppressWarnings("resource")
	public static void main (String[] args) {
		new Scanner(System.in);
		
		double total,percentage;
		float add1 = 56,add2 = 72;
		total=add1+add2;
		percentage = (total /200)*100;
		System.out.println(total);
		System.out.println(percentage);
	}
}
