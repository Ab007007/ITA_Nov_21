package newfeatures;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTabDemo {

	
	@Test
	public void newTab() {
		System.out.println("Welcome to Selenium Project");

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();

		driver.get("http://www.google.com");
		
//		driver.switchTo().newWindow(WindowType.WINDOW);
//		driver.navigate().to("http://formy-project.herokuapp.com/keypress");
	
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("http://formy-project.herokuapp.com/keypress");

	}
}
