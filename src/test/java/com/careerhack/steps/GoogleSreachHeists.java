package com.careerhack.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.careerhack.common.GoogleBaseHeists;
import com.careerhack.pages.PageObjects;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSreachHeists extends GoogleBaseHeists {
	
	
	@Given("I am on the google homepage")
	public void i_am_on_the_google_homepage() {
	
		launchBrowser();
	    
	}
	@When("I enter search {string}")
	public void i_enter_search(String string) {
		// step1: identify the web element and give the 
		// selenium offers 8 locators:
		//id,name,tag,classname, linktext,partial linktext,xpath,css-selector
		//WebElement searchBox;
		//searchBox = driver.findElement(By.name("q"));
		
		//step 2 : Perform action
		//searchBox.sendKeys(string);
		
		PageObjects po = new PageObjects(driver);
				po.enterSearch(string);
	}

	@When("I click on google search button")
	public void i_click_on_google_search_button() {


		PageObjects po = new PageObjects(driver);
				po.clickSearch();
		  
	}

	@Then("I see the number of results return")
	public void i_see_the_number_of_results_return() {
	   //WebElement resultStats;
	   //resultStats = driver.findElement(By.id("result-stats"));
	   //String results = resultStats.getText();
	   //System.out.println("======================================");
	   //System.out.println(results);
	   //System.out.println("======================================");
	    //driver.close();
		
		PageObjects po = new PageObjects(driver);
		po.result();
		
		po.close();
	}


@Given("I am on google search")
public void i_am_on_google_search() {
	launchYahooBrowser();
}

@When("I put {string} search on google")
public void i_put_search_on_google(String string) {
    
}

@Then("I see lot of search camne up for yahoo")
public void i_see_lot_of_search_camne_up_for_yahoo() {
    
}

}
