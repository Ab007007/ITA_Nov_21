package pom.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ita.selenium.actitime.utils.ActitimeUtils;

import junit.framework.Assert;

public class LoginPage 
{
	
	@FindBy(id = "username")
	WebElement userNameTxtBox;
	
	@FindBy(name = "pwd")
	WebElement passwordTxtBox;
	
	
	@FindBy(id = "loginButton")
	WebElement loginButton;
	
	public void enterUserName(String un)
	{
		userNameTxtBox.sendKeys(un);
	}
	
	public void enterPassword(String pw)
	{
		passwordTxtBox.sendKeys(pw);
	}
	
	public void clickOnLogin()
	{
		loginButton.click();
		ActitimeUtils.pause(5000);
		
	}
	
	public void login(String un, String pw)
	{
		enterUserName(un);
		enterPassword(pw);
		clickOnLogin();
	}
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void validateTitle(WebDriver driver, String exptectdTitle)
	{
		Assert.assertEquals(exptectdTitle, driver.getTitle());
	}
	
	
	
	
}
