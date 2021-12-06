package com.ita.javatraining.methods;

public class MethodsWithArguments
{

	public void sum(int a , int b)
	{
		System.out.println("Sum of two numbers is " + (a+b));
	}
	
	public static void main(String[] args)
	{
		MethodsWithArguments md = new MethodsWithArguments();
		
		md.sum(20,30);
		md.sum(200,300);
		md.sum(400,500);
		
		
	}
}
