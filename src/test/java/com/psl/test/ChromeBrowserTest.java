package com.psl.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTest {

	WebDriver chrome;
	@Before()
	public void setUp(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Desktop\\BrowserServers\\chromedriver.exe");
		chrome = new ChromeDriver();
	}
	@Test
	public void chromeTest(){
		chrome.get("http://localhost:8080/BankApp/");
	/*
		WebElement userName = chrome.findElement(By.id("test1"));
		 String s = userName.getTagName();
		 Assert.assertTrue(s.equals("button"));
		*/
	}
	@After
	public void tearDown(){
		chrome.close();
		chrome.quit();
	}
}
