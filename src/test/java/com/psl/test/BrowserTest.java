package com.psl.test;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserTest {
	
	WebDriver driver;
	
	@Before
	public void setUpFirefox(){
		
		driver = new FirefoxDriver();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	@Test()
	public void firefoxTest() throws InterruptedException{

		 driver.get("http://localhost:8080/BankApp/home");
		 
		
	}
	
	@After 
	public void closeFirefox(){
		driver.close();
	}
	
	/*@Test()
	public void chromeTest() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		WebDriver w1=new InternetExplorerDriver();
//		w1.get("website url");
	}*/
}
