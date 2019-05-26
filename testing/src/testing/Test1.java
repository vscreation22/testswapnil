package testing;

import java.awt.List;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","D:\\Testing files\\geckodriver\\geckodriver.exe");
		//System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
		WebDriver objdriver = new FirefoxDriver();	
		//WebDriver objdriver = new ChromeDriver();
		objdriver.manage().window().maximize();
		objdriver.manage().deleteAllCookies();
		objdriver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		objdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		objdriver.get("https://www.amazon.com/");
		objdriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("LenovoLaptop");
		WebElement searchIcon = objdriver.findElement(By.xpath("//input[@class='nav-input']"));
		searchIcon.click();
		WebElement searchIcon2 = objdriver.findElement(By.xpath("//img[@class='s-image']"));
		searchIcon2.click();
		WebElement searchIcon3 = objdriver.findElement(By.xpath("//input[@name='submit.add-to-cart']"));
		searchIcon3.click();
		//objdriver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		WebElement searchIcon4 = objdriver.findElement(By.xpath("//a[@href='/gp/cart/view.html?ref_=nav_cart']|//a[@aria-label='0 items in cart']"));
		//objdriver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
		searchIcon4.click();
		System.out.println();
		objdriver.manage().window().setPosition(new Point(-2000, 0));
		
		
		/*find all link using webdriver*/		
		/*java.util.List<WebElement> links = objdriver.findElements(By.tagName("a"));

		System.out.println(links.size());

		for (int i = 1; i<=links.size(); i=i+1)

		{

			System.out.println(links.get(i).getText());

		}
*/
		 objdriver.close();
		 objdriver.quit();
		  }
	}

	

