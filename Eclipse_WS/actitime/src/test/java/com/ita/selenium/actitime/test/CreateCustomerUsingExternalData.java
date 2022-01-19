package com.ita.selenium.actitime.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.ita.selenium.actitime.utils.ActitimeUtils;
import com.ita.selenium.actitime.utils.ConfigReader;
import com.ita.selenium.actitime.utils.ExcelUtils;

public class CreateCustomerUsingExternalData {
	
	public static void main(String[] args) {
		
		String datasheet = "createcustomer";
		WebDriver driver = ActitimeUtils.getDriver(ConfigReader.getProperty("browser"));
		ActitimeUtils.launch(ConfigReader.getProperty("url"));
		ActitimeUtils.login(ConfigReader.getProperty("username"),ConfigReader.getProperty("password"));
		ActitimeUtils.clickOnTasks();
		
		int rowCount = ExcelUtils.getRowCount(datasheet);
		String cn, cd;
		for(int i = 2; i< rowCount ; i++)
		{
			cn = ExcelUtils.getCell(datasheet, i, 0);
			cd = ExcelUtils.getCell(datasheet, i, 1);
			ActitimeUtils.clickOnNEwCustomerButton();
			ActitimeUtils.createCustomer(cn,cd);
			cn =null; cd = null;
			
		}
			
		ActitimeUtils.logout();
		
	}

}
