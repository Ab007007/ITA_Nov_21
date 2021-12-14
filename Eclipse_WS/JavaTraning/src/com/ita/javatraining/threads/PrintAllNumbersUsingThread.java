package com.ita.javatraining.threads;

public class PrintAllNumbersUsingThread {

	
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("main started");
		EvenNumber ev = new EvenNumber();
		OddNumbers od = new OddNumbers();
		
		ev.start();
		od.start();
		for (int i = 1; i <= 20 ; i++) {
			System.out.println("Printing all numbers...");
			System.out.println(i);
			Thread.sleep(1000);
		}
	
		
		System.out.println("main Ended");
	}
}
