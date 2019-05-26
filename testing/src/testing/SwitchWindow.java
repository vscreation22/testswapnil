package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindow {

	public static void main(String[] args) {
		    System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.amazon.com/");
			
			
			driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "n");
            
			try
			{
				Thread.sleep(3000);
				for(String winHandle:driver.getWindowHandles())
				{
					driver.switchTo().window(winHandle);
				}
				
			//	driver.get("https://www.flipkart.com/");
			}
			
			catch(Exception e)
			{
				System.out.println(e);
			}
	}

}