package com.ita.selenium.actitime.switchto;

import com.ita.selenium.actitime.utils.ActitimeUtils;

public class ConfirmationPopUp extends ActitimeUtils
{
	
	public static void main(String[] args) {
		
			getDriver();
			launch("http://localhost/login.do");
			login("admin", "manager");
			clickOnTasks();
			clickOnNEwCustomerButton();
			type("id", "customerLightBox_nameField", "DAD");
			click("id", "customerLightBox_cancelBtn");

			System.out.println("Alert text " + driver.switchTo().alert().getText());
			pause(5000);
			driver.switchTo().alert().dismiss();
			pause(5000);
			click("id", "customerLightBox_cancelBtn");
			pause(5000);
			driver.switchTo().alert().accept();
			pause(5000);
			driver.close();
	}

}
