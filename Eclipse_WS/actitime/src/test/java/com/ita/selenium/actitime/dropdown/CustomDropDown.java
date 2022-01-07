package com.ita.selenium.actitime.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.ita.selenium.actitime.utils.ActitimeUtils;

public class CustomDropDown {

	
	public static void main(String[] args) {
		
		
		WebDriver driver = ActitimeUtils.getDriver();
		ActitimeUtils.launch("http://localhost/login.do");
		ActitimeUtils.login("admin", "manager");
		
		driver.findElement(By.xpath("//td[@class='userSelectorButton']")).click();
		driver.findElement(By.xpath("//span[text()='Gibson, Maurice']")).click();
		
	}
}
