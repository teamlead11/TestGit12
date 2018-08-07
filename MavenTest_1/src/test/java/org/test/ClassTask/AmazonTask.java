package org.test.ClassTask;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmazonTask {

	static WebDriver driver;

	@Given("User visits Amazon Page")
	public void user_visits_Amazon_Page() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\ECLIPSE\\Selenium-Workspace\\TestngSample\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}

	@When("User enters {string} in Search")
	public void user_enters_in_Search(String arg0) {
		WebElement inputBox = driver.findElement(By.id("twotabsearchtextbox"));
		inputBox.sendKeys(arg0, Keys.ENTER);
	}

	@When("Selects item {int}")
	public void selects_item(Integer index) {

		List<WebElement> elements = driver.findElements(By.xpath("//a[@class='a-link-normal s-access-detail-page  s-color-twister-title-link a-text-normal']"));
		elements.get(index).click();
	}

	@Then("User should be directed to Cart page")
	public void user_should_be_directed_to_Cart_page() {

		int count = 0;
		Set<String> windows = driver.getWindowHandles();
		for (String childWindow : windows) {
			if (count == 1) {
				driver.switchTo().window(childWindow);
			}
		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement parentElement = driver.findElement(By.xpath("//input[@value='Add to Cart']"));
		parentElement.click();
	}
}
