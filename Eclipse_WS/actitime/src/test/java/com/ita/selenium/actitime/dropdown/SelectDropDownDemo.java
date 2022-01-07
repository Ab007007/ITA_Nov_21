package com.ita.selenium.actitime.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.ita.selenium.actitime.utils.ActitimeUtils;

public class SelectDropDownDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =  ActitimeUtils.getDriver();
		ActitimeUtils.launch("http://formy-project.herokuapp.com/form");
		
		driver.findElement(By.id("first-name")).sendKeys("ARAVIND");
		
		driver.findElement(By.id("last-name")).sendKeys("B");

		driver.findElement(By.id("job-title")).sendKeys("Trainer");
		
		driver.findElement(By.id("radio-button-3")).click();

		driver.findElement(By.id("checkbox-1")).click();
		
		Select yoexp =  new Select(driver.findElement(By.id("select-menu")));
		Thread.sleep(5000);
		yoexp.selectByIndex(3);
		Thread.sleep(2000);
		
		yoexp.selectByValue("4");
		Thread.sleep(2000);
		
		yoexp.selectByVisibleText("0-1");
		Thread.sleep(2000);
		
		driver.findElement(By.id("datepicker")).sendKeys("01032022");
		
		Thread.sleep(5000);
		driver.findElement(By.linkText("Submit")).click();
		
				
	
		Thread.sleep(5000);
		driver.close();
	
	
	}
}
