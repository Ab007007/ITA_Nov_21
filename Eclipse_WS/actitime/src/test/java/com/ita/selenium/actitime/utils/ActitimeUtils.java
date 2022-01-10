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
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		
		driver.findElement(By.id("loginButton")).click();
		
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
		driver.findElement(By.xpath("//div[text()='TASKS']/parent::a")).click();
		
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
		
		driver.findElement(By.xpath("//div[@class='addNewContainer']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'New Cust')]")).click();
		
		String customerCreationPage = driver.findElement(By.id("customerLightBox_titlePlaceholder")).getText();
	
	
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
		driver.findElement(By.id("customerLightBox_nameField")).sendKeys(cn);
		driver.findElement(By.id("customerLightBox_descriptionField")).sendKeys(cn);
		driver.findElement(By.id("customerLightBox_commitBtn")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		WebElement visibleSuccessMsg = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='toast']"))));
		
		System.out.println(visibleSuccessMsg.getText());
		
		
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//div[@class='toast']"))));
		System.out.println("Toast Message disappeared!!!");
		
	}
	
	public static void logout() {
		System.out.println("logout of application");
		driver.findElement(By.id("logoutLink")).click();
	}
	
}
