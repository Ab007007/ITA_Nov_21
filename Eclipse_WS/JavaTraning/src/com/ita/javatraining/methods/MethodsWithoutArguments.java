package com.ita.javatraining.methods;

public class MethodsWithoutArguments
{

	public void sum()
	{
		int a  = 20;  int b = 30;
		System.out.println("Sum of two numbers is " + (a+b));
		
	}
	public static void main(String[] args)
	{
		MethodsWithoutArguments md = new MethodsWithoutArguments();
		
		md.sum();
		md.sum();
		md.sum();
		
		
	}
}
