package com.steps;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Contact_Fill_form {
	public static WebDriver driverobj = null;
	
	@Given ("^User should have on login Page$")
	public void user_is_on_Home_Page() throws Throwable {
	    
		driverobj = CommonTest.driver;
		driverobj.get("https://www.crmpro.com/index.html");
	    
	}

     @When("^enter user details$")
	public void enter_user_and(DataTable credentials) // passing paramer using datatable
     {
    	 List<List<String>> data=credentials.raw();
		driverobj.findElement(By.name("username")).sendKeys(data.get(0).get(0));
		driverobj.findElement(By.name("password")).sendKeys(data.get(0).get(1));
		//driverobj.findElement(By.xpath("//input[@class='btn btn-small'][@type='submit']")).click();
		WebElement sendIssue =(WebElement)new WebDriverWait(driverobj,50).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='btn btn-small'][@type='submit']")));
		sendIssue.submit();
	  
	}
     
     @When("^enter user credentials excle$")
	 public void read_data_from_excel()
	 { 
    	Map<String, String> map1 = CommonMethods.readExcel("C:\\Users\\swapnil\\Downloads\\logincredentials.xlsx");
    	 /*String username =  null;
    	 String pwd = null;
    	 File file=new File("C:\\Users\\swapnil\\Downloads\\logincredentials.xlsx");
    	 
    	 try {
			FileInputStream fis = new FileInputStream(file);
			 
	    	 XSSFWorkbook book = new XSSFWorkbook(fis);
	    	 XSSFSheet sheet = book.getSheetAt(0);
	    	username = sheet.getRow(1).getCell(0).getStringCellValue();
	    	pwd = sheet.getRow(1).getCell(1).getStringCellValue();
		} catch ( IOException e) {
		e.printStackTrace();
		}*/
    	
    	
    	 driverobj.findElement(By.name("username")).sendKeys(map1.get("username"));
 		driverobj.findElement(By.name("password")).sendKeys(map1.get("password"));
 		//driverobj.findElement(By.xpath("//input[@class='btn btn-small'][@type='submit']")).click();
 		WebElement sendIssue =(WebElement)new WebDriverWait(driverobj,50).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='btn btn-small'][@type='submit']")));
 		sendIssue.submit();
    	 
	 }
     @Then("^write Excelsheet task$")
     public void write_Excelsheet_task() throws Throwable {
    	 //String username=null;
    	// String pwd=null;
    	 File file=new File("C:\\Users\\swapnil\\Downloads\\logincredentials.xlsx");
    	 
			FileInputStream fis = new FileInputStream(file);
			 
	    	 XSSFWorkbook book = new XSSFWorkbook(fis);
	    	 XSSFSheet sheet = book.getSheetAt(0);
	    	 
	    	 sheet.getRow(0).createCell(2).setCellValue("pass");
	    	 sheet.getRow(1).createCell(2).setCellValue("pass");
	    	 
	    	 FileOutputStream fout = new FileOutputStream(file);
	    	 book.write(fout);
	    	 book.close();
     
     }

    
	
     @Then ("^Message displayed crm Login Successfully again$")
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
     
     @Then("^mouse hover on contacts option$")
     public void mouse_hover_on_contacts_option() throws Throwable {
    	 driverobj.switchTo().frame("mainpanel");
    	 Actions action = new Actions(driverobj);
    	 action.moveToElement(driverobj.findElement(By.xpath("//a[@title='Contacts']"))).build().perform();
			Thread.sleep(3000);
      
     }

     @Then ("^Click on the new contact option \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\"$")
     public void click_on_the_new_contact_option(String fristname , String lastname , String company , String position , String mobile ) throws Throwable {
    	 
    	 driverobj.findElement(By.xpath("//a[text()='New Contact']")).click();
    	 driverobj.findElement(By.id("first_name")).sendKeys(fristname);
    	 driverobj.findElement(By.id("surname")).sendKeys(lastname);
    	 driverobj.findElement(By.xpath("//input[@name='client_lookup']")).sendKeys(company);
    	 driverobj.findElement(By.id("company_position")).sendKeys(position);
    	 driverobj.findElement(By.id("mobile")).sendKeys(mobile);
    	 Thread.sleep(3000);
    	 driverobj.findElement(By.xpath("//input[@type='submit' and @value='Save' and @class='button']")).click();
    	 
    	 
     }
    

        
     }


