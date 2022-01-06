package com.ita.selenium.actitime.utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverUtils {
	public static WebDriver driver = null;
	
	
	public static WebDriver getDriver() {
		System.out.println("Creating driver object");
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		return driver;
		
	}

}
