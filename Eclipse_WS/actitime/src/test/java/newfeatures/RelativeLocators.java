package newfeatures;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.Test;

public class RelativeLocators {

	
	@Test
	public void test() {
		System.out.println("Welcome to Selenium Project");

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();

		driver.get("http://localhost/login.do");
		WebElement ele = driver.findElement(By.id("keepLoggedInLabel"));
		driver.findElement(RelativeLocator.with(By.xpath("//input[@type='checkbox']")).near(ele)).click();
		
	}
}
