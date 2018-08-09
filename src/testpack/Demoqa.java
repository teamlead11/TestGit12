package testpack;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Demoqa {
	static WebDriver driver;
	@Given("open demoqa page")
	public void open_daemoqa_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Am Gracy\\git\\TestGit12\\driver\\chromedriver.exe");
			driver.get("https://demoqa.com/registration/");
	}

	@When("selection of country in demoqa page1")
	public void selection_of_country_in_demoqa_page() {
			driver.findElement(By.id("dropdown_7")).sendKeys("Belize");
	}

	@Then("Testing the country selection in demoqa page1")
	public void testing_the_country_selection_in_demoqa_page() {
			Assert.assertEquals("Belize", driver.findElement(By.id("dropdown_7")).getAttribute("value"));
	}
	
	@When("selection of country in demoqa page")
	public void selection_of_country_in_demoqa_page(DataTable dataTable) {
		
	List<String> asList = dataTable.asList(String.class);
	driver.findElement(By.id("dropdown_7")).sendKeys(asList.get(1));

	}

	@Then("Testing the country selection in demoqa page")
	public void testing_the_country_selection_in_demoqa_page(DataTable dataTable) {
		List<String> asList = dataTable.asList(String.class);
		Assert.assertEquals(asList.get(1),driver.findElement(By.id("dropdown_7")).getAttribute("value"));
		

	}	

	@When("selection of country {string} in demoqa page")
	public void selection_of_country_in_demoqa_page(String country) {
		
	driver.findElement(By.id("dropdown_7")).sendKeys(country);

	}

	@Then("Testing the country {string} in demoqa page")
	public void testing_the_country_selection_in_demoqa_page(String country) {
		
		Assert.assertEquals(country,driver.findElement(By.id("dropdown_7")).getAttribute("value"));
		

	}		
	
}

}
