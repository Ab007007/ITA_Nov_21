package com.ita.javatraining.methods;

public class OverloadingDemo
{
	static void sum() {
		System.out.println("Sum of two numbers is 0");
	}
	
	
	static void sum(int a, int b)
	{
		System.out.println("Sum of two numbers is " + (a+b));
	}
	
	static void sum(int a, int b, int c)
	{
		System.out.println("Sum of three numbers is " + (a+b + c));
	}
	
	static void sum(double a, double b)
	{
		System.out.println("Sum of two numbers " + a + " and " +b + " is " + (a+b));
	}
	static void sum(double a, double b, double c)
	{
		System.out.println("Sum of three numbers is " + (a+b + c));
	}
	
	
	
	
	public static void main(String[] args) 
	{
		
		sum();
		sum(5, 10);
		sum(5.5,55.5);
		sum(5,55.5);
		
	}

}
