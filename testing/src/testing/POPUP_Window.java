package testing;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POPUP_Window {

	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		   driver.get("http://demo.guru99.com/test/delete_customer.php");
        
		   driver.findElement(By.name("cusid")).sendKeys("53920");
		   driver.findElement(By.name("submit")).submit();	
		   
		   //swiching to alert
		   Alert alert = driver.switchTo().alert();
		   
		   
		   // Capturing alert message.    
	        String alertMessage= driver.switchTo().alert().getText();	
	        
	        // Displaying alert message		
	        System.out.println(alertMessage);	
	        Thread.sleep(5000);
	        		
	        // Accepting alert		
	        alert.dismiss();	
	       
	}

}
