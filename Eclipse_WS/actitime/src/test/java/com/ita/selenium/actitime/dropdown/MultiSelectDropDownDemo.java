package com.ita.selenium.actitime.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.ita.selenium.actitime.utils.ActitimeUtils;

public class MultiSelectDropDownDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = ActitimeUtils.getDriver();
		ActitimeUtils.launch("file:///D:/ITA/ITAutomation_Nov_21_Batch/html/multiSelect.html");
		
		Select ms = new Select(driver.findElement(By.tagName("select")));
		
		Thread.sleep(3000);
		ms.selectByIndex(2);
		Thread.sleep(3000);
		ms.selectByValue("saab");
		Thread.sleep(3000);
		ms.selectByVisibleText("Volvo");
		
		Thread.sleep(3000);
		ms.deselectByVisibleText("Mercedes");
		Thread.sleep(3000);
		ms.deselectByIndex(0);
		Thread.sleep(3000);
		ms.deselectByVisibleText("Saab");

		Thread.sleep(3000);
		ms.selectByIndex(2);
		Thread.sleep(3000);
		ms.selectByValue("saab");
		Thread.sleep(3000);
		ms.deselectByVisibleText("Volvo");
		
		Thread.sleep(3000);
		ms.deselectAll();
	
	
	
	}
}
