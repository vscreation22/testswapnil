package testing;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementconcept {

	public static void main(String[] args) {
	
		 System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			
			driver.get("https://in.ebay.com");
			
			//1.get the total count of link on page
			//2.get the text each links on the page
			
			//note:all the links are represented with<a> tag
			
			List <WebElement> linklist = driver.findElements(By.tagName("a"));
			
			//size of links		
			System.out.println(linklist.size());
			
			for(int i=0;i<linklist.size();i++)
			{
				String s1=linklist.get(i).getText();
				System.out.println(s1);
			}

	}

}