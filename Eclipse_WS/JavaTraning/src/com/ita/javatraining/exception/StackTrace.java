package com.ita.javatraining.exception;

public class StackTrace {

	
	public static void main(String[] args) {
		System.out.println("Main Started");
		test2();
		System.out.println("Main Ended");
	}
	public static void test2()
	{
		test();
	}
	public static void test()
	{
		try 
		{
			int a[] = new int[1];
			String str = null;
			a[0] = 20;
			a[1] = 20;
			Thread.sleep(5000);
			//System.out.println("Length of the string " + str.length());
			//System.out.println(str.charAt(1));
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("MEssaage " + e.getMessage());
		}
		
	}
}
