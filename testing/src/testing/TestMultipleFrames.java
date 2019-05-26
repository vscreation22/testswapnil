package testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestMultipleFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://www.toolsqa.com/iframe-practice-page/");
		 // WebElement element =  driver.findElement(By.xpath("//iframe[@id=\"google_shimpl\"]//iframe[2]"));
		  List<WebElement> ls =  driver.findElements(By.xpath("//iframe"));
		  System.out.println(" the no os frame count is  :"+ls.size());
		  //int count = 1;
		   
		  driver.switchTo().frame(1);
		  //driver.switchTo().parentFrame();
		  driver.switchTo().defaultContent();
		  driver.switchTo().frame(2);
		 
		//  System.out.println( element.getAttribute("id"));
			  
		  
		  
//		  driver.switchTo().frame(element);
//		  System.out.println( element.getAttribute("id"));
//		  
//		  System.out.println(element.getCssValue("border-width:"));
		 // driver.quit();
		  
	}
	

}
