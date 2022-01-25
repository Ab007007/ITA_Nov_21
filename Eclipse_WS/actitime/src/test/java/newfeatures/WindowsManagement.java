package newfeatures;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowsManagement {
	@Test
	public void test1()
	{
	System.out.println("Welcome to Selenium Project");
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		
		driver.get("http://www.google.com");
		System.out.println("X " + driver.manage().window().getPosition().getX());
		System.out.println("Y " + driver.manage().window().getPosition().getY());
		System.out.println("Height " + driver.manage().window().getSize().getHeight());
		System.out.println("Width " + driver.manage().window().getSize().getWidth());
		
		driver.manage().window().setSize(new Dimension(500, 800));
		System.out.println("Height " + driver.manage().window().getSize().getHeight());
		System.out.println("Width " + driver.manage().window().getSize().getWidth());
		driver.findElement(By.name("q")).sendKeys("IBM");
		
		List<WebElement> autoSuggestions = driver.findElements(By.xpath("//li[contains(@class,'sbct') and @role='presentation']/parent::ul/li"));
	
		System.out.println("Total  Auto Suggestions displayed is " + autoSuggestions.size());

		for(WebElement ele: autoSuggestions)
		{
			System.out.println(ele.getText());
		}
		driver.close();
		System.out.println("END");
	}

}
