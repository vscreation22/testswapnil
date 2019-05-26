package testing;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestMultipleWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		 System.setProperty("webdriver.gecko.driver","D:\\geckodriver\\geckodriver.exe");
//			//WebDriver driver = new ChromeDriver();
//			WebDriver driver = new FirefoxDriver();
		   System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			driver.get("https://chandanachaitanya.github.io/selenium-practice-site/?languages=Java&enterText=");
			String handler = driver.getWindowHandle();
			
			System.out.println("this is my first  window handle  :" +handler);
			driver.findElement(By.xpath("//button[@id=\"win1\"]")).click();
			Set<String> hanldes = driver.getWindowHandles();
			for(String handle1:hanldes)
			{
				if(handler.equals(handle1))
				{
					System.out.println("This is my parent window handle :"+handle1);
				}else {
					System.out.println("This is my child window  :"+handle1);
				}
				driver.switchTo().window(handle1);
				System.out.println(driver.getWindowHandle());
				 driver.switchTo().window(handler);
				//driver.switchTo().defaultContent();
			     System.out.println(driver.getWindowHandle());
			    
				
				//driver.close();
			}
			
		
	
	 driver.close();
	 driver.quit();
	
	}


}
