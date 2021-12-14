package com.ita.javatraining.threads;

import java.util.Scanner;

public class PrintOddAndEvenNumbers {
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ener the max number");
		int num = sc.nextInt();
		
		for (int i = 1; i <= num ; i++) {
			System.out.println("Printing all numbers...");
			System.out.println(i);
			Thread.sleep(1000);
		}
	
	
		for (int i = 1; i <= num ; i=i+2) {
			System.out.println("Odd nubmers...");
			System.out.println(i);
			Thread.sleep(1000);
			
		}
		
		for (int i = 2; i <= num ; i=i+2) {
			System.out.println("Even numbers...");
			System.out.println(i);
			Thread.sleep(1000);
			
		}
	
	}

}
