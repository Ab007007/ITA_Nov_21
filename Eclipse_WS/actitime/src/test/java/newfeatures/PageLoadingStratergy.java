package newfeatures;

import java.time.Duration;

import org.apache.commons.math3.genetics.Chromosome;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.Test;

public class PageLoadingStratergy {

	@Test
	public void test() {
		System.out.println("Welcome to Selenium Project");

		ChromeOptions opts = new ChromeOptions();
		opts.setPageLoadStrategy(PageLoadStrategy.NONE);
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(opts);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();

		driver.get("http://localhost/login.do");
		WebElement ele = driver.findElement(By.id("keepLoggedInLabel"));
		driver.findElement(RelativeLocator.with(By.xpath("//input[@type='checkbox']")).near(ele)).click();
		
	}
}
