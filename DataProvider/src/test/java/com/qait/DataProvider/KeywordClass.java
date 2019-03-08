package com.qait.DataProvider;


import org.openqa.selenium.WebDriver;


public class KeywordClass extends ClassBaseTest {
	public WebDriver driver;
	public KeywordClass(WebDriver driver) {
		this.driver = driver;
	}
	public void launchChrome() {
		driver.get("https://www.google.com/");
	}
	
	}

