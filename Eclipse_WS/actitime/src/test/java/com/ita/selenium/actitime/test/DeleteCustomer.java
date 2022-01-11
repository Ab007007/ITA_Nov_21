package com.ita.selenium.actitime.test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ita.selenium.actitime.utils.ActitimeUtils;

public class DeleteCustomer {
	
	public static void main(String[] args) {
		WebDriver driver = ActitimeUtils.getDriver("chrome");
		ActitimeUtils.launch("http://localhost/login.do");
		ActitimeUtils.login("admin", "manager");
		ActitimeUtils.clickOnTasks();
		
		ActitimeUtils.type("xpath", "//div[@id='cpTreeBlock']//input", "ITA-2022-Cust3");

		Actions act = new Actions(driver);
		act.moveToElement(
				ActitimeUtils.getElement("xpath", "//div[@class='node allCustomersNode selected']/following-sibling::div")).perform(); 
		ActitimeUtils.pause(5000);
		act.click(
				ActitimeUtils.getElement("xpath", "//div[@class='node allCustomersNode selected']/following-sibling::div/div[@class='editButton available']")).perform();
		ActitimeUtils.pause(5000);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(ActitimeUtils.getElement("xpath", "//div[@class='edit_customer_sliding_panel sliding_panel']//div[text()='ACTIONS']"))).click();
		
		ActitimeUtils.click("xpath", "//div[@class='edit_customer_sliding_panel sliding_panel']//div[text()='Delete']");
		
		ActitimeUtils.click("id", "customerPanel_deleteConfirm_submitTitle");
		
	
		ActitimeUtils.validateSuccessMsg();
		ActitimeUtils.logout();
	}

}
