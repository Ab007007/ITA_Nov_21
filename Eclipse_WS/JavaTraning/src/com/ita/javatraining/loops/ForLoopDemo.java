package com.ita.javatraining.loops;

public class ForLoopDemo {

	public static void main(String[] args) {
		int num = 23;
		System.out.println("Generating a table for " + num);
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " * " + i + " = " + (num * i));
		}

		System.out.println("Generted");
	}

}
