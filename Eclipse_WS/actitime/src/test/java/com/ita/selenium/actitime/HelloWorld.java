package com.ita.selenium.actitime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorld {
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to Selenium Project");
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Thread.sleep(5555);
		System.out.println("END");
	}

}
