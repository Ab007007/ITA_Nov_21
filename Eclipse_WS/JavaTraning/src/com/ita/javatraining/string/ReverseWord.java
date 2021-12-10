package com.ita.javatraining.string;

public class ReverseWord {
	
	public static void main(String[] args) {

	
		String str = "Hello all How are you !";
		String[] words = str.split(" ");
		for(String word: words) {
			
			for (int i = word.length()-1 ; i >=0 ; i--) 
			{
				System.out.print(word.charAt(i));
			}
			System.out.print(" ");
		}
		
	}

}
