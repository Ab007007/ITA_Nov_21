package com.ita.javatraining.ib;

public class SIBDemo 
{
	static int count =0;
	static
	{
		System.out.println("TEST");
	}
	
	{
		++count;
	}
	
	public static void main(String[] args)
	{
		SIBDemo sb1 = new SIBDemo();

		SIBDemo sb2 = new SIBDemo();

		SIBDemo sb3 = new SIBDemo();
		
		SIBDemo sb4 = new SIBDemo();
		System.out.println("Main started");
		
		System.out.println("Total number of Objects created " + count);
	}

}
