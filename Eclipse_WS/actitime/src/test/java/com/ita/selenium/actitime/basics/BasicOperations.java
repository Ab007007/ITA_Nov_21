package com.ita.selenium.actitime.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicOperations {

	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("WElcome to type and click operations");
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://formy-project.herokuapp.com/form");
//		WebElement firstName = driver.findElement(By.id("first-name"));
//		firstName.sendKeys("HELLO");
		
		driver.findElement(By.id("first-name")).sendKeys("ARAVIND");
		
		driver.findElement(By.id("last-name")).sendKeys("B");

		driver.findElement(By.id("job-title")).sendKeys("Trainer");
		
		driver.findElement(By.id("radio-button-3")).click();

		driver.findElement(By.id("checkbox-1")).click();
		
		driver.findElement(By.id("datepicker")).sendKeys("01032022");
		
		Thread.sleep(5000);
		driver.findElement(By.linkText("Submit")).click();
		
				
	
		Thread.sleep(5000);
		driver.close();
	
	
	}
}
