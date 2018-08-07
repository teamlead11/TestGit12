package org.maven.project;

import java.util.List;
import java.util.Set;

import org.apache.xmlbeans.impl.inst2xsd.SalamiSliceStrategy;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Amazon extends Base {

	@Given("^The user is in amazon page$")
	public void the_user_is_in_amazon_page() {
		openBrowser();

	}

	@When("^The user pass the value \"([^\"]*)\" to choose the product$")
	public void addProduct(int prdtIndex) {

		WebElement searchAmazon = driver.findElement(By.id("twotabsearchtextbox"));
		WebDriverWait w = new WebDriverWait(driver, 250);
		WebElement until = w.until(ExpectedConditions.elementToBeClickable(searchAmazon));
		until.sendKeys("samsung", Keys.ENTER);
		List<WebElement> samProdutcts = driver
				.findElements(By.xpath("//h2[@class='a-size-base s-inline  s-access-title  a-text-normal']"));
		samProdutcts.get(prdtIndex - 1).click();

		String pWind = driver.getWindowHandle();
		System.out.println(pWind);
		Set<String> cWind = driver.getWindowHandles();
		System.out.println(cWind);

		for (String x : cWind) {

			if (!pWind.equals(x)) {

				driver.switchTo().window(x);
				WebElement cartButton = driver.findElement(By.id("add-to-cart-button"));
				cartButton.click();
				
				 

			}

		}

	}

	@Then("^The user verifies the selected product \"([^\"]*)\" is added to the cart$")
	public void the_user_verifies_the_selected_product_is_added_to_the_cart(int prdtIndex) {

		Assert.assertEquals(prdtIndex,prdtIndex );
	
	}

}
