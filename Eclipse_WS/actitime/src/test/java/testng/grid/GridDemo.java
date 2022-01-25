package testng.grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.ita.selenium.actitime.utils.ActitimeUtils;

public class GridDemo {

	
	
	@Test
	public void test1()
	{
	System.out.println("Welcome to Selenium Project");
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		System.out.println("END");
	}
	
	@Test
	public void test2() throws MalformedURLException
	{
	System.out.println("Welcome to Selenium Project");
//		ChromeOptions options = new ChromeOptions();
//		options.setCapability(CapabilityType.PLATFORM_NAME, Platform.WINDOWS);
//		options.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.ACCEPT);
//		options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
//		options.addArguments("disable-infobars");
	
//		FirefoxOptions options = new FirefoxOptions();
//		options.addPreference("browserName", "firefox");
//		options.addPreference("browserversion", "55.0.2");
//		options.addPreference("network.proxy.type", 0);
//		options.setAcceptInsecureCerts(true);
//		WebDriver driver = new RemoteWebDriver(new URL("http://172.27.60.241:4444"), options);
		
		WebDriver driver = ActitimeUtils.getRemoteDriver("http://172.27.60.241:4444", "ff");
		driver.get("http://www.google.com");
		System.out.println("END");
	}
}
