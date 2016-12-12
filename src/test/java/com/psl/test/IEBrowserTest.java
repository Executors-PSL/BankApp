package com.psl.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;



import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;





import org.openqa.selenium.chrome.ChromeDriver;
public class IEBrowserTest {
	WebDriver ie;
	@Before()
	public void setUp(){
		System.setProperty("webdriver.ie.driver","C:\\Users\\Administrator\\Desktop\\BrowserServers\\IEDriverServer.exe");
		ie = new ChromeDriver();
	}
	@Test
	public void chromeTest(){
		ie.get("http://localhost:8080/BankApp/");
	
		WebElement userName = ie.findElement(By.id("test1"));
		 String s = userName.getTagName();
		 Assert.assertTrue(s.equals("button"));
		
	}
	@After
	public void tearDown(){
		ie.close();
		ie.quit();
	}
}
