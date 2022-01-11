package com.ita.selenium.actitime.actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.ita.selenium.actitime.utils.ActitimeUtils;

public class KeyBoardOperationsDemo {

	public static void main(String[] args) {
		
		WebDriver driver = ActitimeUtils.getDriver("chrome");
		ActitimeUtils.launch("http://localhost/login.do");
		
		Actions act = new Actions(driver);
		
		act.sendKeys("admin").perform();
		ActitimeUtils.pause(5000);
		
		act.sendKeys(Keys.TAB).perform();
		ActitimeUtils.pause(5000);
		
		act.sendKeys("manager").perform();
		ActitimeUtils.pause(5000);
		
		act.sendKeys(Keys.ENTER).perform();
		ActitimeUtils.pause(5000);
		
		
	}
}
