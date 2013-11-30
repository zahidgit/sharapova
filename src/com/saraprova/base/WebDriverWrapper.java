package com.saraprova.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebDriverWrapper {
	public static WebDriver driver;
	
	public void typeById(String id, String value){
		driver.findElement(By.id(id)).clear();
		driver.findElement(By.id(id)).sendKeys(value);
	}
	public void clickById(String id){
		driver.findElement(By.id(id)).click();
	}
	public void clickByXpath(String xpath){
		driver.findElement(By.xpath(xpath)).click();
	}
	
	public void assertEquals(String actual, String expected){
		driver.findElement(By.xpath(actual)).sendKeys(expected);
	}


}

