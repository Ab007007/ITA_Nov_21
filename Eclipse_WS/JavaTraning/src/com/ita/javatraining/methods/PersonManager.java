package com.ita.javatraining.methods;

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
	
	
	public String toString() {
		// TODO Auto-generated method stub
		return "My Person Object has Name :  " + this.name + "\nAge : " + this.age
				+ "\nHeight : " + this.height + "\nWeight : " + this.weight;
	}
	
}

public class PersonManager 
{
	public static void main(String[] args) {
//		String sso;
		Person p1 = new Person("aravind",36,5.7,77);
		System.out.println(p1);
		
		Person p2 = new Person();
		System.out.println(p2);
	}
	
	

}
