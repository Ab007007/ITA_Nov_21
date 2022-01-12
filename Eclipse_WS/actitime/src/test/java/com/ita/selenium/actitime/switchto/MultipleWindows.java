package com.ita.selenium.actitime.switchto;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.ita.selenium.actitime.utils.ActitimeUtils;

public class MultipleWindows extends ActitimeUtils{

	
	public static void main(String[] args) {
		
		getDriver();
		launch("https://www.irctc.co.in/eticketing/errors.html#");
		click("linktext", "Contact Us");
		
		Set<String> windowID = driver.getWindowHandles();
		Iterator<String> it = windowID.iterator();
		
		String parentID = it.next();
		String childID = it.next();
		
		
		driver.switchTo().window(childID);
		List<WebElement> emailIds = driver.findElements(By.tagName("a"));
		for(WebElement emailID: emailIds)
		{
			System.out.println(emailID.getText());
		}
		//driver.close();
		driver.switchTo().window(parentID);
		System.out.println("-----------------Printing all links in the parent -----------------");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for(WebElement link: links)
		{
			System.out.println(link.getText());
		}
		driver.quit();
		
	}
}
