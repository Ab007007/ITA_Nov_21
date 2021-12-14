package com.ita.javatraining.threads;

public class RunnableMainClass {

	
	public static void main(String[] args) throws InterruptedException {
		RunnableEvenNumber rev = new RunnableEvenNumber();
		RunnableOddNumbers rod = new RunnableOddNumbers();
		
		Thread t1 = new Thread(rev);
		Thread t2 = new Thread(rod);
		
		t1.start();
		t1.setName("Even number ");
		System.out.println(t1.getName());
		t2.start();
		t2.setName("Odd Number ");
		System.out.println(t2.getName());
		
		for (int i = 0; i < 20; i++) {
			
			System.out.println(Thread.currentThread().getName() + " : " + i);
			Thread.sleep(1000);
		}
		
		
	}
}
