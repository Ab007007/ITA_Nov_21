package com.ita.javatraining.loops;

import java.util.Scanner;

public class PrintTable {

	static Scanner sc = null;
	static int num;
	static String choice = null;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		do {
			System.out.println("Please enter the number for which you want to generate Table");
			num = sc.nextInt();
			for (int i = 1; i <= 10; i++) {
				System.out.println(num + " * " + i + " = " + (num * i));
			}
			System.out.println("Do you want to continue..yes/no?");
			choice = sc.next();
		}while(choice.equalsIgnoreCase("yes"));
		
		System.out.println("Thanks for using Generate Tables program!!!");
	}
}
