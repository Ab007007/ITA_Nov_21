package com.ita.javatraining.threads;

public class RunnableOddNumbers implements Runnable
{
	@Override
	public void run() {
		for (int i = 1; i <= 20; i = i + 2) {
			System.out.println("Odd nubmers...");
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}		
	}
}
