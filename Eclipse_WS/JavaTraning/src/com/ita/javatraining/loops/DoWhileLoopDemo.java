package com.ita.javatraining.loops;

public class DoWhileLoopDemo {

	
	public static void main(String[] args) {
		int num = 23;
		int i = 11; 
		do
		{
			System.out.println(num + " * " + i + " = " + (num * i));
			i++;
		}while (i<=10);
	}
}
