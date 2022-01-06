package com.ita.javatraining.abstract1;

public class AnnInnerClass {
	
	public static void main(String[] args) {
		
		Geometry g = new Geometry() {
			@Override
			public void area(int... a) {
				System.out.println("ADFASDFASSSSSS");
				
			}
		};
		
		g.area();
	}

}
