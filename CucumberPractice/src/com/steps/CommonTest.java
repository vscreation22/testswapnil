package com.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class CommonTest {

public static WebDriver driver = null;
	
	@Before
	public void beforescenario() {
		
		System.out.println("This test will be running in before scenario");
	   //	System.setProperty("webdriver.gecko.driver","D:\\Testing files\\geckodriver\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver","D:\\chrome files\\chromedriver.exe");
		//driver = new FirefoxDriver();
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(100,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(80,TimeUnit.SECONDS);
		//driver.manage().timeouts().setScriptTimeout(2000,TimeUnit.SECONDS);
		//driver.get("https://www.crmpro.com/index.html");
	}
	
	
	@After
	public void afterscenario() {
	
		driver.close();
		driver.quit();
	}
	
}

