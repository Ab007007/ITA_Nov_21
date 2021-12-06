package com.ita.javatraining.methods;

public class MethodsWithReturnType {

	
	public static void main(String[] args) {
		MethodsWithReturnType mr = new MethodsWithReturnType();
		
		int age = mr.calculateAge(1980);
		
		System.out.println("You have to work for  " + (60-age) + " Years, for your Retirement ");
	}
	
	
	public int calculateAge(int birthYear)
	{
		int age  = 2021 - birthYear;
		System.out.println("You are " + age + " years old");
		return age;
	}
}
