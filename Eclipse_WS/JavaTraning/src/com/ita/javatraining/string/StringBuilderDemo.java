package com.ita.javatraining.string;

public class StringBuilderDemo {

	
	public static void main(String[] args) {
		
		String str1  = "Hello All welcome to String Program";
		StringBuilder str = new StringBuilder(str1);
		
		System.out.println("Length : " + str.length());
		System.out.println("Char At : " + str.charAt(10));
		System.out.println("Index Of : " + str.indexOf("A"));
		System.out.println("Index Of : " + str.indexOf("e", 3));
		System.out.println("Index Of : " + str.lastIndexOf("e"));
		System.out.println("Index Of : " + str.indexOf("a"));
		System.out.println("Equal  : " + "abc".equals("abc"));
		String welcomeMsg = str.substring(str.indexOf("welcome"), str.indexOf("Program"));
		System.out.println(welcomeMsg);
		
		
		System.out.println("Address : " + str.hashCode());
		System.out.println("Equal Ignore Case : " + "abc".equalsIgnoreCase("ABC"));
		str.append("New Address");
		System.out.println("New content : " + str);
		System.out.println("New Address : " + str.hashCode());
		
		str.insert(10, "Test insertion");
		System.out.println(str);
		
		str.reverse();
		System.out.println(str);
		str.reverse();
		
		str.delete(10, str.indexOf("welcome"));
		System.out.println(str);
	
		
	}
}
