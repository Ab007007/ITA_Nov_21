package com.ita.selenium.actitime.switchto;

import org.openqa.selenium.WebDriver;

import com.ita.selenium.actitime.utils.ActitimeUtils;

public class AlertsDemo extends ActitimeUtils
{
	
	public static void main(String[] args) {
		
		getDriver();
		launch("http://formy-project.herokuapp.com/switch-window");
		click("id", "alert-button");
		String textOnAlert = driver.switchTo().alert().getText();
		System.out.println("TEXT ON ALERT : " + textOnAlert);
		driver.switchTo().alert().accept();
		
	}

}
