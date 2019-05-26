package com.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class AmezonLogin {

	
	By loginButton = new By.ByXPath("//*[@type='submit']");
	By logoutbutton = new By.ByXPath("//span[text()='Sign Out']");
	By emailinput = new By.ByXPath("//input[@id='ap_email']");
	By pwdinputbox = new By.ByXPath("//input[@id='ap_password']");
	By accuntlist = new By.ByXPath("//a[@id='nav-link-accountList']");
	By profilename = new By.ByXPath("//a/span[@class='nav-line-1']");
	
	public static WebDriver driverobj = null;
	
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
	    
		driverobj = CommonTest.driver;
		driverobj.get("https://www.amazon.com/");
		
	    
	}

	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() throws Throwable {
	   
		driverobj.findElement(accuntlist).click();
	   
	}

	@When("^User enters UserName and Password$")
	public void user_enters_UserName_and_Password() throws Throwable {
	  driverobj.findElement(emailinput).sendKeys("Swapnilv215@gmail.com");
	  driverobj.findElement(pwdinputbox).sendKeys("swapnil22");
	  driverobj.findElement( loginButton).click();
	   
	}

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {
	String loginname= driverobj.findElement(profilename).getText();
	  if(loginname.equals("Hello, Swapnil"))
	  {
		  System.out.println("login successfully");
	  }
	  else
		  System.out.println("not successfully");
	    
	
}
	@And("^User enters validUserName and invalidPassword$")	
	public void invalid_credentils() throws Throwable {
		 driverobj.findElement(emailinput).sendKeys("Swapnilv215@gmail.com");
		  driverobj.findElement(pwdinputbox).sendKeys("swapnil");
		  driverobj.findElement( loginButton).click();
	}
	
	@Then("^Message displayed wrong Login credentials$")
	public void message_displayed_invalid() throws Throwable {
     driverobj.findElement( loginButton).click();
	//System.out.println("invalid credentials");
}
	
   @And("^move mouse on account option$")
	public void mousehover() throws Throwable {
		Actions action = new Actions(driverobj);
		WebElement element = driverobj.findElement(accuntlist);
		action.moveToElement(element).moveToElement(driverobj.findElement(logoutbutton)).click().build().perform();
		
	}
	
	@Then("^Then user should be logout$")
	public void logout() throws Throwable {
	
	System.out.println("logout successfully");
	
}
//@And("^User enters valid \"(.*)\" and \"(.*)\"$")
//public void login_with_parametr(String username, String password)
//{
//	
//}
	
}
	