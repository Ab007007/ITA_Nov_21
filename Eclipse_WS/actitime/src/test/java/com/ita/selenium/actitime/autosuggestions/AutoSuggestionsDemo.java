package com.ita.selenium.actitime.autosuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.ita.selenium.actitime.utils.ActitimeUtils;
import com.ita.selenium.actitime.utils.DriverUtils;

public class AutoSuggestionsDemo {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = DriverUtils.getDriver();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("IBM");
		
//		Thread.sleep(5000);
		List<WebElement> autoSuggestions = driver.findElements(By.xpath("//li[contains(@class,'sbct') and @role='presentation']/parent::ul/li"));
	
		System.out.println("Total  Auto Suggestions displayed is " + autoSuggestions.size());

		for(WebElement ele: autoSuggestions)
		{
			System.out.println(ele.getText());
		}
		driver.close();
	
	}

}
