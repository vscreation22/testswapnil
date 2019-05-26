package POM_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	

	
	public static By serachelement = new By.ByXPath("//*[@id=\"twotabsearchtextbox\"]");
			
	
	WebDriver driver = null;
	public static String verifyTitle(WebDriver driver){
		
	//	System.out.println( driver.getTitle());
		return driver.getTitle();
	}
	
	public String checkHomepagelogo(WebDriver driver) {
		this.driver=driver;
		WebElement element = this.driver.findElement(By.xpath("//*[@class='nav-logo-link']"));
		//String labelval = 
		return element.getAttribute("aria-label");
	}

	public void searchinput(WebDriver driver, String val)
	{
		this.driver= driver;
		driver.findElement(serachelement).sendKeys(val);
		
	}
	
	
}
