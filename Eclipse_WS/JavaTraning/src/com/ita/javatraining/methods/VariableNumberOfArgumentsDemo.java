package com.ita.javatraining.methods;

public class VariableNumberOfArgumentsDemo 
{
	static void sum(int  ...a)
	{
		System.out.println("Sum of numbers is " + a.length);
	}
	
	
	public static void main(String[] args) {
		
		sum();
		sum(10);
		sum(10,20);
		sum(10,20,30);
		sum(10,20,30,40);
		
		
		
	}

}
