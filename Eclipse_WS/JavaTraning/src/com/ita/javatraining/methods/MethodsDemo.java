package com.ita.javatraining.methods;

public class MethodsDemo {

	
	public static void sum(int a , int b)
	{
		System.out.println("Sum of two numbers " + (a+b));
	}
	
	
	public static int calAge(int birthYear)
	{
		return (2021-birthYear);
	}
	
	
	
	public static void main(String[] args) {
		
		sum(2,3);
		int age = calAge(1984);
		System.out.println("AGE " + age);
	}
}

