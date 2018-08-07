package org.maven.project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Cucumber  {

	static WebDriver driver;
	static WebElement fName, lName;

	@Given("^The user is in demoqa page$")
	public void browserlaunch() {
		System.setProperty("webdriver.chrome.driver", "D:\\JK\\SeleniumLearning\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/registration/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@When("^The user enters the firstname and lastname$")
	public void enterVlues() {

		driver.findElement(By.id("name_3_firstname")).sendKeys("Test");
		driver.findElement(By.id("name_3_lastname")).sendKeys("Tester");

	}

	@Then("^The user verifies the entered value$")
	public void verifyValues() {
		Assert.assertEquals("Test", driver.findElement(By.id("name_3_firstname")).getAttribute("value"));
		Assert.assertEquals("Tester", driver.findElement(By.id("name_3_lastname")).getAttribute("value"));
	}

	@When("^The user enters the firstname \"([^\"]*)\" , lastname \"([^\"]*)\" and country \"([^\"]*)\"$")
	public void enterVlues(String fname, String lname, String dropcountry) {

		driver.findElement(By.id("name_3_firstname")).sendKeys(fname);
		driver.findElement(By.id("name_3_lastname")).sendKeys(lname);
		driver.findElement(By.id("dropdown_7"));
		Select s = new Select(driver.findElement(By.id("dropdown_7")));
		s.selectByValue(dropcountry);
	}

	@Then("^The user verifies the entered firstname \"([^\"]*)\" , lastname \"([^\"]*)\" and country \"([^\"]*)\"$")
	public void verifyValues(String fname, String lname, String dropcountry) {
		Assert.assertEquals(fname, driver.findElement(By.id("name_3_firstname")).getAttribute("value"));
		Assert.assertEquals(lname, driver.findElement(By.id("name_3_lastname")).getAttribute("value"));
		Assert.assertEquals(dropcountry, driver.findElement(By.id("dropdown_7")).getAttribute("value"));
	}

}
