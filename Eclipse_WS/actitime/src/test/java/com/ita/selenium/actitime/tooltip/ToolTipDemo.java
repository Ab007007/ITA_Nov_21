package com.ita.selenium.actitime.tooltip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.ita.selenium.actitime.utils.ActitimeUtils;

public class ToolTipDemo {
	
	public static void main(String[] args) {
		WebDriver driver = ActitimeUtils.getDriver();
		ActitimeUtils.launch("https://www.google.com/");
		
		String tooltip = driver.findElement(By.xpath("//a[contains(@href,'products')]")).getAttribute("aria-label");
				
		System.out.println("Tool tip displayed is " + tooltip);		
	}

}
