package com.ita.javatraining.variables;

public class LocalVariablesDemo {

	
	public static void main(String[] args)
	{
		test1();
		test2();
	}
	
	
	static void test1()
	{
		int marks = 100;
		System.out.println("My Total marks in test1 is " + marks);
	}
	
	static void test2()
	{
		int marks = 200;
		System.out.println("My Total marks in test2 is " + marks);
	}
}
