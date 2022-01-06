package com.ita.selenium.actitime.sync;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ita.selenium.actitime.utils.ActitimeUtils;

public class WebDriverWaitDemoOnJS {

	
	public static void main(String[] args) {
		WebDriver driver = ActitimeUtils.getDriver();
		ActitimeUtils.launch("file:///D:/ITA/ITAutomation_Nov_21_Batch/html/tiimeout.html");
		
		driver.findElement(By.tagName("button")).click();
		WebDriverWait wait  =  new WebDriverWait(driver, Duration.ofSeconds(20));
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("demo"))));
		String text1 = driver.findElement(By.id("demo")).getText();
		String text2 = driver.findElement(By.id("demo2")).getText();
		System.out.println("Value on Demo1 is " + text1);
		System.out.println("Value on Demo2 is " + text2);
		
		
	}
}
