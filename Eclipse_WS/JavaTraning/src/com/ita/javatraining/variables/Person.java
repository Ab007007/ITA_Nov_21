package com.ita.javatraining.variables;

public class Person
{
	// instance variables of a Person Class
	String name ;
	int age;
	double height;
	double weight;
	boolean working;
	
	//static variable of a Person Class
	static String country = "INDIA";
	
	// final variable of a Person Class
	final static int maxAge = 100;
	
	public static void main(String[] args)
	{
		Person p1 = new Person();
		p1.name = "Aravinda";
		p1.age = 38;
		p1.height = 5.8;
		p1.weight = 70;
		p1.working = true;
		//p1.maxAge = 200;
		
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(Person.country);
		System.out.println("Max Age of a person is " + p1.maxAge);
		
		Person p2 = new Person();
		p2.name = "Harry";
		p2.age = 45;
		p2.height = 5;
		p2.weight = 85;
		p2.working = true;
		System.out.println("-----------------\n Printing second object values");
		System.out.println(p2.name);
		System.out.println(p2.age);
		System.out.println(country);
	}
}
