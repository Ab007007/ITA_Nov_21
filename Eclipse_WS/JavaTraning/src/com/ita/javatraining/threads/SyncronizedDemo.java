package com.ita.javatraining.threads;

public class SyncronizedDemo implements Runnable
{
	@Override
	public void run() {
		printMyName(Thread.currentThread().getName());
		
	}
	
	public synchronized void printMyName(String name) {
		for (int i = 0; i < 10; i++) {
			System.out.println(name);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
}
