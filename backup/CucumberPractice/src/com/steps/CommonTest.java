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
		System.setProperty("webdriver.gecko.driver","D:\\Testing files\\geckodriver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	
	@After
	public void test_Cleaning(){
        System.out.println("Closing Browser");
        Object baseURL = null;
        driver.close();
        driver.quit();
    }
	
}
