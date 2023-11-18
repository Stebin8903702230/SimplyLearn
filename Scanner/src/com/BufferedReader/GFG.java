package com.BufferedReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GFG {
	// Java Program for taking user
	// input using BufferedReader Class
	
		// Main Method
		public static void main(String[] args) throws IOException {
			// Creating BufferedReader Object
			// InputStreamReader converts bytes to
			// stream of character
			BufferedReader bfn = new BufferedReader(
				new InputStreamReader(System.in));
			// String reading internally
			System.out.println("Enter your name : ");
			String str = bfn.readLine();
			System.out.println("Enter your address : ");
			String f= bfn.readLine();

			// Integer reading internally
			System.out.println("Enter your age : ");
			int it = Integer.parseInt(bfn.readLine());

			// Printing String
			System.out.println("Entered Name : " + str);
			System.out.println("Entered Address : "+ f);

			// Printing Integer
			System.out.println("Entered Integer : " + it);
			return;
		}
}
