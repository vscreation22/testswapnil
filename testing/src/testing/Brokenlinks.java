package testing;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Brokenlinks {

	public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException {
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver\\geckodriver.exe");
		WebDriver objdriver = new FirefoxDriver();	
		objdriver.manage().window().maximize();
		objdriver.manage().deleteAllCookies();
		objdriver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		objdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		objdriver.get("https://www.amazon.com/");
		/*objdriver.get("https://classic.crmpro.com");
		
		objdriver.findElement(By.xpath("//input[@name='username']")).sendKeys("swapnil22");
		objdriver.findElement(By.xpath("//input[@name='password']")).sendKeys("swapnil22");
		Thread.sleep(3000);*/
		/*objdriver.findElement(By.xpath("//input[@class='btn btn-small']")).click();*/
		
		//get the list of all links and img:500
		
		List<WebElement> linklist = objdriver.findElements(By.tagName("a"));
		linklist.addAll(objdriver.findElements(By.tagName("img")));
		
		System.out.println("size of full links and images---->"+ linklist.size());
		
		List<WebElement> activelinks = new ArrayList<WebElement>();//filter the all links
		
		for( int i=0;i<linklist.size();i++) {
			if(linklist.get(i).getAttribute("href")!=null) {
				
				 activelinks.add(linklist.get(i));
			}
		}
		System.out.println("size od active links and images---->"+ activelinks.size());
		
		
		//3.check the href,url, with httpconnection api:
		//200--0k
		//400--not found
		//500--internal server error
		
		for(int j=0;j<activelinks.size();j++)
		{
			
			HttpsURLConnection connection =(HttpsURLConnection) new URL(activelinks.get(j).getAttribute("href")).openConnection();
			
			
			connection.connect();
			String response= connection.getResponseMessage(); //200 ok
			connection.disconnect();
			System.out.println(activelinks.get(j).getAttribute("href")+"--->"+response);
		}

	}

}
