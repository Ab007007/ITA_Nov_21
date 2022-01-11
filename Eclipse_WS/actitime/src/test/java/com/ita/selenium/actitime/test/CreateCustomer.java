package com.ita.selenium.actitime.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.ita.selenium.actitime.utils.ActitimeUtils;

public class CreateCustomer {
	
	public static void main(String[] args) {
		
		
		WebDriver driver = ActitimeUtils.getDriver("ff");
		ActitimeUtils.launch("http://localhost/login.do");
		ActitimeUtils.login("admin", "manager");
		ActitimeUtils.clickOnTasks();
		ActitimeUtils.clickOnNEwCustomerButton();
		ActitimeUtils.createCustomer("ITA-2022-Cust7", "ITA-2022-Cust-Desc");
		ActitimeUtils.logout();
		
	}

}
