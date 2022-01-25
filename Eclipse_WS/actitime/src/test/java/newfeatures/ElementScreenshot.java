package newfeatures;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ElementScreenshot {

	@Test
	public void elementSS() {
		System.out.println("Welcome to Selenium Project");

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();

		driver.get("http://www.google.com");
		WebElement googleIcom = driver.findElement(By.xpath("//img[@alt='Google']"));
		String dateAndtime = new Date().toString().replace(" ", "_").replace(":", "_");
		File screenShot = googleIcom.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenShot, new File("target\\screenshots\\SS_"+dateAndtime + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
