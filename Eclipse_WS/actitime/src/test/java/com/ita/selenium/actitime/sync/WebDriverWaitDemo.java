package com.ita.selenium.actitime.sync;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ita.selenium.actitime.utils.ActitimeUtils;

public class WebDriverWaitDemo {

	public static void main(String[] args) {
		
		
		WebDriver driver = ActitimeUtils.getDriver();
		ActitimeUtils.launch("https://www.flipkart.com/");
		
		
		WebDriverWait wait  =  new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement closeButton = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"))));
		
		List<WebElement> textOnLoginAlert = driver.findElements(By.xpath("//button[@class='_2KpZ6l _2doB4z']/following-sibling::div//span"));
		
		for(WebElement ele : textOnLoginAlert)
		{
			System.out.println(ele.getText());
		}
		
		
		closeButton.click();
		
		driver.close();
		
	}
}
