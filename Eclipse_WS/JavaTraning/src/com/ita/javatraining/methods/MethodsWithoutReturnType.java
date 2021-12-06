package com.ita.javatraining.methods;

public class MethodsWithoutReturnType {

	
	public static void main(String[] args) {
		MethodsWithoutReturnType mr = new MethodsWithoutReturnType();
		
		mr.calculateAge(1980);
		mr.calculateAge(1984);
	}
	
	
	public void calculateAge(int birthYear)
	{
		int age  = 2021 - birthYear;
		System.out.println("You are " + age + " years old");
		
	}
}
