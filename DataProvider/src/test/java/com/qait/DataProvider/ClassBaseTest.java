package com.qait.DataProvider;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ClassBaseTest {
	public WebDriver driver;
    public KeywordClass key;
	
	@BeforeClass()
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "/home/qainfotech/eclipse-workspace/selenium/chromedriver");
		driver = new ChromeDriver();
	   key = new KeywordClass(driver);
	} 
	
	
	@AfterClass()

	public void afterClass() {
		driver.quit();

	}
}
