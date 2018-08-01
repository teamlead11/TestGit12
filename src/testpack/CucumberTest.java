package org.test.MavenTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class CucumberTest {
	WebDriver driver;
	@Given("User is in demoqa site")
	public void user_is_in_demoqa_site() {
	    // Write code here that turns the phrase above into concrete actions	
		System.setProperty("webdriver.chrome.driver", "C:\\ECLIPSE\\Selenium-Workspace\\TestngSample\\driver\\chromedriver.exe");
    	driver = new ChromeDriver();    
    	driver.manage().window().maximize();
    	driver.get("https://demoqa.com/registration/");
	}
	WebElement firstName;
	WebElement lastName;
	@When("Enters firstname and lastname")
	public void enters_firstname_and_lastname() {
	    // Write code here that turns the phrase above into concrete actions
		firstName = driver.findElement(By.id("name_3_firstname"));
		firstName.sendKeys("Soumendu");
		lastName = driver.findElement(By.id("name_3_lastname"));
		lastName.sendKeys("Khilar");
	}

	@Then("User verifies entered input")
	public void user_verifies_entered_input() {
	    // Write code here that turns the phrase above into concrete actions
		org.junit.Assert.assertEquals("Soumendu", firstName.getAttribute("value"));
		org.junit.Assert.assertEquals("Khilar", lastName.getAttribute("value"));
	}
}
