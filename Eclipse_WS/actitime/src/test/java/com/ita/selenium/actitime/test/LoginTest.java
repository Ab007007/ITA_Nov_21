package com.ita.selenium.actitime.test;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.ita.selenium.actitime.utils.ActitimeUtils;

public class LoginTest {

	
	WebDriver driver = null;
	
	@Test
	@Parameters({"url","username","password","browser"})
	public void loginWithValidCredentials(String url, String un, String pwd, String bw)
	{
		driver = ActitimeUtils.getDriver(bw);
		ActitimeUtils.launch(url);
		ActitimeUtils.login(un,pwd);
		ActitimeUtils.logout();
	}
	
	@Test
	@Parameters({"url","username","password","browser"})
	public void loginWithInValidCredentials(String url, String un, String pwd, String bw)
	{
		driver = ActitimeUtils.getDriver(bw);
		ActitimeUtils.launch(url);
		ActitimeUtils.login("12313",pwd);
		ActitimeUtils.logout();
	}
	
	
	@AfterMethod
	public void testResult(ITestResult result)
	{
		if(result.getStatus() == ITestResult.FAILURE)
		{
			System.out.println(result.getName() + " : "  +result.getTestName()) ;
			ActitimeUtils.captureScreenShot();
		}
		else
		{
			System.out.println(result.getName() + " : "  +result.getTestName()) ;
			System.out.println("Test PASSED");
		}
	}
}
