package com.ita.javatraining.string;

public class ReverseString {
	
	public static void main(String[] args) {

	
		String str = "Hello all How are you !";
		
		for (int i = str.length()-1 ; i >=0 ; i--) 
		{
			System.out.print(str.charAt(i));
		}
	}

}
