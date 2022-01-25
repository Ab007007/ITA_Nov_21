package com.ita.selenium.actitime.utils;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverUtils {
	public static WebDriver driver = null;

	/**
	 * Function to return Chrome Driver, this will have an implicit wait of 30
	 * seconds and also it maximizes the Browser
	 * 
	 * @author Aravind
	 * @return - chrome driver
	 * @last modified :
	 */
	public static WebDriver getDriver() {
		System.out.println("Creating driver object");

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		return driver;

	}

	/**
	 * Function to return Chrome Driver, this will have an implicit wait of 30
	 * seconds and also it maximizes the Browser
	 * 
	 * @author Aravind
	 * @param type chrome or ff or edge
	 * @return
	 */
	public static WebDriver getDriver(String type) {
		System.out.println("Creating driver for " + type + " browser");

		switch (type.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "ff":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;

		default:
			System.out.println("Please contact Framework Developer to support " + type + " Browser");
			break;
		}

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		return driver;
	}
	
	public static WebDriver getRemoteDriver(String hubURL, String type)  {
		System.out.println("Creating driver for " + type + " browser");

		switch (type.toLowerCase()) {
		case "chrome":
			ChromeOptions options = new ChromeOptions();
			options.setCapability(CapabilityType.PLATFORM_NAME, Platform.WINDOWS);
			options.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.ACCEPT);
			options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			options.addArguments("disable-infobars");
			try {
				driver = new RemoteWebDriver(new URL(hubURL), options);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  //"http://172.27.60.241:4444"
			break;
		case "ff":
			FirefoxOptions foptions = new FirefoxOptions();
			foptions.addPreference("browserName", "firefox");
			foptions.addPreference("browserversion", "55.0.2");
			foptions.addPreference("network.proxy.type", 0);
			foptions.setAcceptInsecureCerts(true);
			try {
				driver = new RemoteWebDriver(new URL("http://172.27.60.241:4444"), foptions);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case "edge":
			EdgeOptions eoptions = new EdgeOptions();
			eoptions.setCapability(CapabilityType.PLATFORM_NAME, Platform.WINDOWS);
			eoptions.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.ACCEPT);
			eoptions.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			eoptions.addArguments("disable-infobars");
			try {
				driver = new RemoteWebDriver(new URL("http://172.27.60.241:4444"), eoptions);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;

		default:
			System.out.println("Please contact Framework Developer to support " + type + " Browser");
			break;
		}

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		return driver;
	}

	public static void pause(int ms) {
		System.out.println("Paused for demo only!!!!!");
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static WebElement getElement(String type, String value) {
		WebElement ele = null;
		
		System.out.println("Finding The element with " + type + " and " + value);

		switch (type) {
		case "id":
				ele = driver.findElement(By.id(value));
			break;

		case "name":
			ele = driver.findElement(By.name(value));
			break;

		case "classname":
			ele = driver.findElement(By.className(value));
			break;

		case "tagname":
			ele = driver.findElement(By.tagName(value));
			break;

		case "linktext":
			ele = driver.findElement(By.linkText(value));
			break;

		case "partiallinktext":
			ele = driver.findElement(By.partialLinkText(value));
			break;

		case "css":
			ele = driver.findElement(By.cssSelector(value));
			break;
		case "xpath":
			ele = driver.findElement(By.xpath(value));
			break;

		default:
			System.out.println("Please check your type " + type);
			break;
			
		}
		
//		if(ele.isDisplayed() && ele.isEnabled())
//		{
//			System.out.println("Element is Displayed and Enabled");
//			return ele;
//		}
//		else
//		{
//			System.out.println("Element is either not Displayed or Enabled");
//			return null;
//		}

		return ele;
	}

	
	public static void click(String type, String value)
	{
		System.out.println("Performing click operation ");
		getElement(type, value).click();
	}
	
	public static void clickUsingAction(String type, String value)
	{
		System.out.println("Performing click operation ");
		Actions act = new Actions(driver);
		act.click(getElement(type, value)).perform();
	}
	
	public static void type(String type, String value, String textTotype)
	{
		System.out.println("Performing type" + textTotype + " on the element");
		getElement(type, value).sendKeys(textTotype);
	}
	
	public static String getText(String type, String value)
	{
		System.out.println("Getting text on the element ");
		String text = getElement(type, value).getText();
		System.out.println("Got Text on the element " + text);
		return text ;
	}
	
	public static String getAttributet(String type, String value, String attributeName)
	{
		System.out.println("Getting Attribute on the element ");
		String text = getElement(type, value).getAttribute(attributeName);
		System.out.println("Got Attribute on the element " + text);
		return text ;
	}
	
	
	public static void captureScreenShot()
	{
		System.out.println("Capturing Screen Shot");
		TakesScreenshot ss = (TakesScreenshot)driver;
		String dateAndtime = new Date().toString().replace(" ", "_").replace(":", "_");
		File screenShot = ss.getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(screenShot, new File("target\\screenshots\\SS_"+dateAndtime + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
