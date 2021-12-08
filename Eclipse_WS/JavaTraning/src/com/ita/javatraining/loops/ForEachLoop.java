package com.ita.javatraining.loops;

public class ForEachLoop {

	public static void main(String[] args) {
		
		String fruits[] = {"Apple", "Orange", "Banana", "Grapes"};
		
		for (int i = 0; i < fruits.length; i++) 
		{
			System.out.println(fruits[i]);
			
		}
		
		
		System.out.println("Using For Each loop");
		for(String f:fruits) {
			System.out.println(f);
		}
	}
}
