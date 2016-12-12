package com.psl.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {
	WebDriver firefox;

	@Before
	public void setUpFirefox() {
		firefox = new FirefoxDriver();
	}
	@Test()
	public void firefoxTest() throws InterruptedException {
		firefox.get("http://localhost:8080/BankApp/");
		/*
		WebElement userName = firefox.findElement(By.id("test1"));
		 String s = userName.getTagName();
		 Assert.assertTrue(s.equals("button")); */
	}
	@After
	public void closeFirefox() {
		firefox.close();
		firefox.quit();
	}
}
