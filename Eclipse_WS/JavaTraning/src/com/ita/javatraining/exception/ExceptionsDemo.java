package com.ita.javatraining.exception;

public class ExceptionsDemo {

	public static void main(String[] args) {
		System.out.println("Main Started");
		try {
			int a[] = new int[3];
			a[0] = 100;
			a[1] = 200;
			a[2] = 300;
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			ex.printStackTrace();
			System.out.println("Excepiton Raised!!!!  " + ex.getMessage());
		}
		
		
		System.out.println("Main Ended");
	}
}
