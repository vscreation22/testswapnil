package POM_Package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import POM_Package.HomePage;

public class Driver {

	static HomePage page = new HomePage();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
		WebDriver objdriver = new ChromeDriver();
		objdriver.manage().window().maximize();
		objdriver.manage().deleteAllCookies();
		objdriver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		objdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		objdriver.get("https://www.amazon.com/");
	     //HomePage.verifyTitle(objdriver);
	    System.out.println(page.verifyTitle(objdriver));
	    System.out.println(page.checkHomepagelogo(objdriver));
	    page.searchinput(objdriver, "laptop");
	    
		
		

	}

}
