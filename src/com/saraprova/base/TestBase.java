package com.saraprova.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.saraprova.Data.saraprovaLongingData;
import com.saraprova.locator.SaraprovaLocator;

public class TestBase extends WebDriverWrapper {
	public String url = "http://www.facebook.com/";
	// public static WebDriver driver;
	public String Browser = "Firefox";

	@BeforeTest
	public void setUp() {
		if (Browser.equalsIgnoreCase("Chrome")) {
			Chrome();
			// driver= new ChromeDriver();
		} else if (Browser.equalsIgnoreCase("Safari")) {
			driver = new SafariDriver();
		} else {
			driver = new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		faceBookLonging();
		//driver.switchTo().frame(driver.findElement(By.id(id)));

	}

	public void Chrome() {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("uder.dir") + "//lib//chromedriver.exe");
		driver = new ChromeDriver();
	}

	public SaraprovaLocator loc = new SaraprovaLocator();
	public saraprovaLongingData data = new saraprovaLongingData();

	@AfterTest
	public void tearDown() {
		driver.close();
	}

	public void faceBookLonging() {
		typeById(loc.longingEmailId, data.FacebookLongingEmailId);
		typeById(loc.longingPasswordId, data.FacebookLongingPassword);
		clickById(loc.longing);

	}

}
