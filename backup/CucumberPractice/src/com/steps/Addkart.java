package com.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Addkart {
	
	
	public static WebDriver driverobj = null;
	
	
	@Given("^User is on home page$")
	public void user_is_on_home_page() throws Throwable {
	    
		driverobj = CommonTest.driver;
		driverobj.get("https://www.amazon.com/");
	}

	@When("^search the product and select it$")
	public void search_the_product_and_select_it() throws Throwable {
	}

	@When("^Click on the addTokart button$")
	public void click_on_the_addTokart_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^product should be add in the kart$")
	public void produt_should_add_in_the_kart() throws Throwable {
	   
	   
	}

}
