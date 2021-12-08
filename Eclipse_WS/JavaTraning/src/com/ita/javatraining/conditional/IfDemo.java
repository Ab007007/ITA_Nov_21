package com.ita.javatraining.conditional;

public class IfDemo {

	public static void main(String[] args) {
		System.out.println("Main started...");
		int age = 17;
		
		if(age >= 18) 
		{
			System.out.println("Eligible to apply DL");
		}
		else
		{
			System.out.println("Your age is low, you have to wait for " + ( 18-age ) + " Years to apply DL");
		}
		
		
		System.out.println("Main Ended.");
		
		
	}
}
