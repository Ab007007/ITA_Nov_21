package com.ita.selenium.actitime.test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserOperations {

	WebDriver driver = null;
	@Test
	public void browserOperations() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();

		
		driver.get("http://www.google.com");
		Thread.sleep(5000);
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().to("http://www.localhost/login.do");
		Thread.sleep(5000);
		driver.navigate().refresh();
	}
}
