package com.psl.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
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
	}
	@After
	public void tearDown(){
		ie.close();
		ie.quit();
	}
}
