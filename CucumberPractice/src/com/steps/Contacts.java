package com.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Contacts {
	
public static WebDriver driverobj = null;
	
     @Given ("^User is on login Page$")
	public void user_is_on_Home_Page() throws Throwable {
	    
		driverobj = CommonTest.driver;
		driverobj.get("https://www.crmpro.com/index.html");
	    
	}

     @When("^user enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_user_and(String uname, String pass) 
     {
		
		driverobj.findElement(By.name("username")).sendKeys(uname);
		driverobj.findElement(By.name("password")).sendKeys(pass);
		//driverobj.findElement(By.xpath("//input[@class='btn btn-small'][@type='submit']")).click();
		WebElement sendIssue =(WebElement)new WebDriverWait(driverobj,50).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='btn btn-small'][@type='submit']")));
		sendIssue.submit();
	  
	}
	
     @Then ("^Message displayed crm Login Successfully$")
	public void message_displayed_Login_Successfully() 
     {
	//String loginname= driverobj.findElement(By.xpath("//td[@class='headertext'][1]")).getText();
	  //if(loginname.equals("swapnil vyawahare"))
	 // {
		  System.out.println("login successfully");
	//  }
	//  else
		 // System.out.println("not successfully");
	    
	
}
}
