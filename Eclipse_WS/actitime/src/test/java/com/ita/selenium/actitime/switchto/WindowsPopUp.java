package com.ita.selenium.actitime.switchto;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.ita.selenium.actitime.utils.ActitimeUtils;

public class WindowsPopUp {

	static {
		try {
			Runtime.getRuntime().exec("D:\\ITA\\ITAutomation_Nov_21_Batch\\autoit\\chrome_Fileupload.exe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		WebDriver driver = ActitimeUtils.getDriver("ff");
		ActitimeUtils.launch("http://formy-project.herokuapp.com/fileupload");
		ActitimeUtils.click("id", "file-upload-field");
		
		
	}
}
