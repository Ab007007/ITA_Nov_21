package com.ita.javatraining.threads;

public class RunnableEvenNumber implements Runnable
{

	@Override
	public void run()
	{
		for (int i = 2; i <= 20 ; i=i+2) {
			System.out.println("Even numbers...");
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
