package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertDemo {

	
	@Test
	public void addition()
	{
		System.out.println("Addition Test Started");
		Assert.assertEquals((5+5), 11);
		System.out.println("Addition Test Ended");
	}
	
	
	@Test
	public void substraction()
	{
		System.out.println("Substraction Test Started");
		Assert.assertEquals((5-5), 0);
		System.out.println("Substraction Test Ended");
	}
}
