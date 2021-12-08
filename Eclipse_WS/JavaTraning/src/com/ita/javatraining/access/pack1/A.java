package com.ita.javatraining.access.pack1;

public class A 
{
	
	private int privateMember = 10;
	int defaultMember = 20;
	protected int protectedMember = 30;
	public int publicMember = 40;
	
	
	public final void testMe()
	{
		System.out.println("I'mm a final member .. my output is consant");
	}
	
	private void printGlobalVariables()
	{
		System.out.println("Private Member " + privateMember);
		System.out.println("Default Member " + defaultMember);
		System.out.println("Protected Member " + protectedMember);
		System.out.println("Public Member " + publicMember);
	}
	
	
	public static void main(String[] args) {
		A a = new A();
		a.printGlobalVariables();
	}

}
