package pom.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

	
	@FindBy(xpath = "//div[text()='TASKS']/parent::a")
	WebElement taskTab;
	
	@FindBy(id = "logoutLink")
	WebElement logoutLink;
	
	public void logout() {
		logoutLink.click();
	}
	
	public void clickOnTasks()
	{
		taskTab.click();
	}
	
	public DashboardPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
