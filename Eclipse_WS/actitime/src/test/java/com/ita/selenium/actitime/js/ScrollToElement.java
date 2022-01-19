package com.ita.selenium.actitime.js;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.ita.selenium.actitime.utils.ActitimeUtils;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollToElement {

	
	@Test
	public void JsExecutor()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver  = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		driver.get("http://formy-project.herokuapp.com/scroll");
		ActitimeUtils.pause(5000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("window.scrollTo(0, 600);");
		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.id("name")));
	
	}
}
