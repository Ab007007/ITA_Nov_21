package com.ita.selenium.actitime.sync;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;
import com.ita.selenium.actitime.utils.ActitimeUtils;

public class FluentWaitDemo {
	
	public static void main(String[] args) {
		WebDriver driver = ActitimeUtils.getDriver();
		ActitimeUtils.launch("file:///D:/ITA/ITAutomation_Nov_21_Batch/html/tiimeout.html");
		
		driver.findElement(By.tagName("button")).click();
		
		
		FluentWait<WebElement> wait = new FluentWait<WebElement>(driver.findElement(By.id("demo")))
				.pollingEvery(Duration.ofMillis(10))
				.withTimeout(Duration.ofSeconds(30))
				.ignoring(NoSuchElementException.class)
				.ignoring(Exception.class);
		
		
		Function<WebElement, Boolean> fun = new Function<WebElement, Boolean>()
		{

			@Override
			public Boolean apply(WebElement ele) {
				String eleTxt = ele.getText();
				boolean flag = false;
				if(eleTxt.equals("Hello"))
				{
					System.out.println("Element Found");
					flag =true;
				}
				else
				{
					System.out.println("Waiting for the element to present");
					flag = false;
				}
			return flag;
			}
			
		}; 
		
		wait.until(fun);
		
		
		
		String text1 = driver.findElement(By.id("demo")).getText();
		String text2 = driver.findElement(By.id("demo2")).getText();
		System.out.println("Value on Demo1 is " + text1);
		System.out.println("Value on Demo2 is " + text2);
	}

}
