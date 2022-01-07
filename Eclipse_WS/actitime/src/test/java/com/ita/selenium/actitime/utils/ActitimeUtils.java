package com.ita.selenium.actitime.utils;

import org.openqa.selenium.By;

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
}
