package testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
		// System.setProperty("webdriver.gecko.driver","D:\\geckodriver\\geckodriver.exe");
			WebDriver driver = new ChromeDriver();
			//WebDriver driver = new FirefoxDriver();
			driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://www.amazon.com/");
					
			//driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
			//driver.navigate().to("https://www.google.com/");
			
			//click on order option
			//driver.findElement(By.xpath("//span[@class='nav-line-2']")).click();
			//scroll down
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window.scrollBy(0,3000)");
			  
			driver.findElement(By.xpath("//li/a[text()='Your Account']")).click();
			  //driver.findElement(By.xpath("//*[contains(text(),'Sign in to see personalized recommendations')]")).click();
		
			driver.navigate().back();
			
			driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
			driver.navigate().forward();
			
			//refresh page
			driver.navigate().refresh();
			
			//int s=driver.getWindowHandles().size();
			//System.out.println(s);
	}
	}

