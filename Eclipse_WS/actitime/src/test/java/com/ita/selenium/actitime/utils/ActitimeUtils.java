package com.ita.selenium.actitime.utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeUtils extends DriverUtils
{
	
	
	public static void launch(String url)
	{
		System.out.println("Launching Application " + url);
		driver.get(url);
	}

	public static void login(String un, String pwd)
	{
		System.out.println("Login to the application using " + un + " and " + pwd);
		type("id", "username", un);
		type("name", "pwd", pwd);
		click("id", "loginButton");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void clickOnTasks()
	{
		System.out.println("Clicking on Tasks Page");
		click("xpath", "//div[text()='TASKS']/parent::a");
		String title = driver.getTitle();
		if(title.equals("actiTIME - Task List"))
		{
			System.out.println("Tasks  Page Displayed");
		}
		else
		{
			System.out.println("Task page is not displayed");
		}
	}
	
	public static void clickOnNEwCustomerButton()
	{
		System.out.println("Clicking on NEwCustomerButton ");
		click("xpath", "//div[@class='addNewContainer']");
		click("xpath", "//div[contains(text(),'New Cust')]");
		
		String customerCreationPage = getText("id", "customerLightBox_titlePlaceholder"); 
	
	
		if(customerCreationPage.equals("Create New Customer"))
		{
			System.out.println("Create New Customer  Page is Displayed");
		}
		else
		{
			System.out.println("Create New Customer page is not displayed");
		}
	
	}
	
	public static void createCustomer(String cn, String cd)
	{
		type("id", "customerLightBox_nameField", cn);
		type("id", "customerLightBox_descriptionField", cd);
		click("id", "customerLightBox_commitBtn");
		
		validateSuccessMsg();
		
		System.out.println("Toast Message disappeared!!!");
		
	}
	
	public static void validateSuccessMsg()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		WebElement visibleSuccessMsg = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='toast']"))));
		
		System.out.println(visibleSuccessMsg.getText());
		
		
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//div[@class='toast']"))));
	}
	
	public static void logout() {
		System.out.println("logout of application");
		click("id", "logoutLink");
	
	}
	
}
