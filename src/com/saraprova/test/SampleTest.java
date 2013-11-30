package com.saraprova.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.saraprova.base.TestBase;


public class SampleTest extends TestBase{
	@Test
	public void channelUrl(){
		driver.get(loc.SaraprovaUrl);
		driver.switchTo().frame(driver.findElement(By.id("iframe_canvas")));
		clickByXpath(loc.PrizeButtonXpath);
		clickByXpath(loc.PlayAndWinButton);
		clickByXpath(loc.EpisodbuttonXpath);
		clickByXpath(loc.RecordButtonXpath);
		//assertEquals(loc.ExpectedTextXpath,data.actualText);
	}
	
	
	

}
