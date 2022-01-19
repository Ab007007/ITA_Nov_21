package testng;

import org.testng.annotations.Test;

public class Cars {
	
	@Test(groups = {"mahendra"})
	public void xuv500()
	{
		System.out.println("xuv-500");
	}

	
	@Test(groups = {"mahendra"})
	public void xuv300()
	{
		System.out.println("xuv-300");
	}

	@Test(groups = {"kia"})
	public void kiaCarnival()
	{
		System.out.println("KIA");
	}
	
	@Test(groups = {"kia"})
	public void kiaCeltos()
	{
		System.out.println("KIA-Celtos");
	}

	@Test(groups = {"maruthi"})
	public void swift()
	{
		System.out.println("swift");
	}

	@Test(groups = {"maruthi"})
	public void ertiga()
	{
		System.out.println("ertiga");
	}


}
