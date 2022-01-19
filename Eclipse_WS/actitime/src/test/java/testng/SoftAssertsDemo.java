package testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertsDemo {

	
	@Test
	public void addition()
	{
		System.out.println("Addition Test Started");
		SoftAssert sa = new SoftAssert();
		sa.assertEquals((5+5), 10);
		sa.assertEquals((5+2), 7);
		sa.assertEquals((5+3), 11);
		sa.assertEquals((5+4), 11);
		
		sa.assertAll();
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
