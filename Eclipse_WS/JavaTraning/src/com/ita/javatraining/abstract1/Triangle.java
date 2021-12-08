package com.ita.javatraining.abstract1;

public class Triangle extends Geometry
{
	
	@Override
	public void area(int... a) {
		System.out.println("Area of Triangle " + (0.5 * a[0] * a[1]));
		
	}

	
	public static void main(String[] args) {
		Triangle t1 = new Triangle();
		t1.area(4,6);
				
		
	}
}
