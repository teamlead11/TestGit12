package org.maven.project;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon1 extends Base {

	public static void searchAddProduct(int prdtIndex) {

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
			
			if(!pWind.equals(x)) {
				
				driver.switchTo().window(x);
				driver.findElement(By.id("add-to-cart-button")).click();
				driver.close();
				driver.switchTo().defaultContent();
			}
			
		}
		
	}

	public static void selectProduct() {

	}

	public static void main(String[] args) {
		openBrowser();
		searchAddProduct(5);
		// closeBrowser();

	}

}
