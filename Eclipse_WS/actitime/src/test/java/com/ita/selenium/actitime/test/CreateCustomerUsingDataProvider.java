package com.ita.selenium.actitime.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.ita.selenium.actitime.utils.ActitimeUtils;
import com.ita.selenium.actitime.utils.ConfigReader;

import testng.TestData;

public class CreateCustomerUsingDataProvider {
	WebDriver driver = null;
	@BeforeClass
	@Parameters({"url","username","password","browser"})
	public void navigateTotaskPage(String url, String un, String pwd, String bw)
	{
		
		driver = ActitimeUtils.getDriver(bw);
		ActitimeUtils.launch(url);
		ActitimeUtils.login(un,pwd);
		ActitimeUtils.clickOnTasks();
		
	}
	@Test(dataProvider = "createcustomerdata", dataProviderClass = TestData.class)
	public void createCustomerTest(String cn, String cd) {
			ActitimeUtils.clickOnNEwCustomerButton();
			ActitimeUtils.createCustomer(cn,cd);
		}
			
	@AfterClass
	public void logout()
	{
		ActitimeUtils.logout();
	}
		

}
