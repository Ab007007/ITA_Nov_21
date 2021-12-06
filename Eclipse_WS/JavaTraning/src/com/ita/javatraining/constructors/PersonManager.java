package com.ita.javatraining.constructors;

class Person
{
	String name;
	int age;
	double height;
	double weight;
	static String country = "India";
	
	public Person(String n, int a, double h, double w)
	{
		this.name = n;
		this.age = a;
		this.height = h;
		this.weight = w;
	}
	
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
}

public class PersonManager 
{
	public static void main(String[] args) {
//		String sso;
		Person p1 = new Person("aravind",36,5.7,77);
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.height);
		System.out.println(p1.weight);
		
		
		Person p2 = new Person();
		System.out.println(p2.name);
	}
	
	

}
