package com.ita.javatraining.exception;

public class ThrowsDemo {

	public static void main(String[] args) {
		System.out.println("Main Started");
		try {
			test();
		}catch(Exception ex)
		{
			System.out.println("Exception occured while calling function " + ex.getMessage());
		}
	
		System.out.println("Main Ended");
	}

	public static void test()  throws InterruptedException, ArrayIndexOutOfBoundsException{
		int a[] = new int[1];
		String str = null;
		a[0] = 20;
		//a[1] = 20;
		Thread.sleep(5000);
		 System.out.println("Length of the string " + str.length());
		// System.out.println(str.charAt(1));

	}
}
