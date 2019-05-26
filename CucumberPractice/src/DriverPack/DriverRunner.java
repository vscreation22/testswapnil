package DriverPack;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "features"
		,glue={"com.steps"}
		,tags= {"@contacts_Form"}
		//,plugin= {"pretty","html:target/site/cucumber-pretty"}
		,dryRun=false
		)

public class DriverRunner {

	
}
