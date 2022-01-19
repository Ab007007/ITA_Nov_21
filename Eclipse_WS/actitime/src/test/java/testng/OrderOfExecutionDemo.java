package testng;

import org.testng.annotations.Test;

public class OrderOfExecutionDemo 
{
	
	@Test
	public void test2()
	{
		System.out.println("TEST2");
	}

	@Test(dependsOnMethods = "test2")
	public void test1()
	{
		System.out.println("TEST1");
	}

	@Test(dependsOnMethods = "test1")
	public void test3()
	{
		System.out.println("TEST3");
	}

}
