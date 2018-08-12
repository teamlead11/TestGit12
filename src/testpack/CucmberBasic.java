package testpack;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucmberBasic {
	static WebDriver driver;
	@Given("^The user is in demoqa page$")
	public void the_user_is_in_demoqa_page() {
	 driver = new ChromeDriver();
	 driver.get("http://demoqa.com/registration/");
	}

	@When("^The user enters first name and last name$")
	public void the_user_enters_first_name_and_last_name() {
	     driver.findElement(By.id("name_3_firstname")).sendKeys("Amudhan");
	     driver.findElement(By.id("name_3_lastname")).sendKeys("Kumanan");
	}

	@Then("^The user verifies the text in the textbox$")
	public void the_user_verifies_the_text_in_the_textbox() {
	    Assert.assertEquals("Amudhan", driver.findElement(By.id("name_3_firstname")).getAttribute("value"));
	    Assert.assertEquals("Kumanan", driver.findElement(By.id("name_3_lastname")).getAttribute("value"));
	}
}
