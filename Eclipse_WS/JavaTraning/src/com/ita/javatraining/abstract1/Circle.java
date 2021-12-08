package com.ita.javatraining.abstract1;

public class Circle extends Geometry
{
	@Override
	public void area(int... a) {
		
		double area  = 3.142 * a[0] * a[0];
		System.out.println("Area of Circle is " + area);
	}
	
	
	
	public static void main(String[] args) {
		Circle c = new Circle();
		c.area(5);
	}
}
