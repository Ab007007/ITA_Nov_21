package com.ita.javatraining.exception;

public class FinallyDemo {

	
	public static void main(String[] args) {
		System.out.println("Main Started");
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
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException aiobex)
		{
			System.out.println("Exception occured with a message - problem with index " + aiobex.getMessage());
		}
		catch(NullPointerException siobex) {
			System.out.println("String issue - Exception raised with a message "  + siobex.getMessage());
		}
		finally {
			System.out.println("I'm executed ");
		}
		System.out.println("Main Ended");
	}
}

