package com.ita.selenium.actitime.switchto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.ita.selenium.actitime.utils.ActitimeUtils;

public class DragAndDropDemo {

	
	public static void main(String[] args) {
		
		WebDriver driver = ActitimeUtils.getDriver();
		ActitimeUtils.launch("https://jqueryui.com/droppable/");
		//driver.switchTo().frame(0);
		driver.switchTo().frame(ActitimeUtils.getElement("xpath", "//iframe[contains(@src,'default')]"));
		WebElement srcEle = driver.findElement(By.id("draggable"));
		WebElement destEle = driver.findElement(By.id("droppable"));
		
		System.out.println("Before Drag and Drop");
		System.out.println("Source Element " + srcEle.getText());
		System.out.println("Destination Element " + destEle.getText());
		
		Actions act = new Actions(driver);
		act.dragAndDrop(srcEle, destEle).perform();
		
		System.out.println("After Drag and Drop");
		System.out.println("Source Element " + srcEle.getText());
		System.out.println("Destination Element " + destEle.getText());
		
		driver.switchTo().defaultContent();
		ActitimeUtils.click("linktext","Draggable");
	}
}
