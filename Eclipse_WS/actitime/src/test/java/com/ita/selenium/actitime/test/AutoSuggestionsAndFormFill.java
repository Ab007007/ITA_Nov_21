package com.ita.selenium.actitime.test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.ita.selenium.actitime.utils.ActitimeUtils;
import com.ita.selenium.actitime.utils.ConfigReader;

import testng.TestData;

public class AutoSuggestionsAndFormFill {
	WebDriver driver = null;

	@Test
	public void validatateAutoSuggestions() {

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("IBM");

//			Thread.sleep(5000);
		List<WebElement> autoSuggestions = driver
				.findElements(By.xpath("//li[contains(@class,'sbct') and @role='presentation']/parent::ul/li"));

		System.out.println("Total  Auto Suggestions displayed is " + autoSuggestions.size());

		for (WebElement ele : autoSuggestions) {
			System.out.println(ele.getText());
		}
		driver.close();

	}

	@Test
	public void formFill() throws InterruptedException {

		System.out.println("WElcome to type and click operations");
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
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
