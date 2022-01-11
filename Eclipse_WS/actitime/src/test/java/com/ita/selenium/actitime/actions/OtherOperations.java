package com.ita.selenium.actitime.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.ita.selenium.actitime.utils.ActitimeUtils;

public class OtherOperations {

	
	public static void main(String[] args) {
		
		WebDriver driver = ActitimeUtils.getDriver();
		
		Actions act = new Actions(driver);
		
		act.doubleClick().perform();
		act.contextClick().perform();
		act.clickAndHold(driver.findElement(By.id(""))).perform();
		act.release().perform();
	}
}
