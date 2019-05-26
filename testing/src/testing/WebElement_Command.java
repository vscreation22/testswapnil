package testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElement_Command {

	public static void main(String[] args) throws InterruptedException {
		//   System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
		   System.setProperty("webdriver.gecko.driver","D:\\Testing files\\geckodriver\\geckodriver.exe");
		  // WebDriver driver = new ChromeDriver();
			WebDriver driver = new FirefoxDriver();	
			driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			
			driver.manage().window().maximize();
		   driver.get("http://demo.guru99.com/test/radio.html");
		   driver.manage().timeouts().setScriptTimeout(5000,TimeUnit.SECONDS);
		   
		   	WebElement WebElement_radio1 = driver.findElement(By.id("vfb-7-1"));
		   Thread.sleep(500);
			WebElement WebElement_radio2 = driver.findElement(By.id("vfb-7-2"));
			Thread.sleep(500);
			//radio button is selected			
			WebElement_radio1.click();
			
			System.out.println("redio button option 1 is selected");
		   	
			WebElement_radio2.click();
			System.out.println("redio button option 2 is selected");   
			
			
			//Selecting checkbox
		 	WebElement WebElement_checkbox1 = driver.findElement(By.id("vfb-6-0"));
		 	Thread.sleep(500);
		 	WebElement WebElement_checkbox2 = driver.findElement(By.id("vfb-6-1"));
		 	
		
		 	
		 	 // This will Toggle the Check box 		
		 	WebElement_checkbox1.click();	
		 	Thread.sleep(500);
		 	WebElement_checkbox1.click();
	        // Check whether the Check box is toggled on 		
	        if (WebElement_checkbox1.isSelected()) {					
	            System.out.println("Checkbox is Toggled On");					

	        } else {			
	            System.out.println("Checkbox is Toggled Off");					
	        }		
	        
	        
	    	//WebElement_checkbox1.click();	
	    	//WebElement_checkbox2.click();	
	     	//explicit wait
		 	WebDriverWait wait1 = new WebDriverWait(driver, 20);
		 	wait1.until(ExpectedConditions.elementToBeClickable(WebElement_checkbox2)).click();
		 	
		 	Thread.sleep(500);
		 	driver.close();
			
	}

}
