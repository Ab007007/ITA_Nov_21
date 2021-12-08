package com.ita.javatraining.string;

public class StringDemo {

	
	public static void main(String[] args) {
		
		String str  = "Hello All welcome to String Program";
		String str1 = new String("xyz");
		
		System.out.println("Length : " + str.length());
		System.out.println("Char At : " + str.charAt(10));
		System.out.println("Index Of : " + str.indexOf("A"));
		System.out.println("Index Of : " + str.indexOf("e", 3));
		System.out.println("Index Of : " + str.lastIndexOf("e"));
		System.out.println("Index Of : " + str.indexOf("a"));
		System.out.println("Upper : " + str.toUpperCase());
		System.out.println("Lower : " + str.toLowerCase());
		System.out.println("Equal  : " + "abc".equals("abc"));
		
		System.out.println("Address : " + str.hashCode());
		System.out.println("Equal Ignore Case : " + "abc".equalsIgnoreCase("ABC"));
		
		str = str.concat(" New content ");
		System.out.println("New content : " + str);
		System.out.println("New Address : " + str.hashCode());
		
		
		String[] words = str.split(" ");
		for(String word: words) {
			System.out.println(word);
		}
		
		String welcomeMsg = str.substring(str.indexOf("welcome"), str.indexOf("Program"));
		System.out.println(welcomeMsg);
	}
}
