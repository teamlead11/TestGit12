package org.test.ClassTask;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTask {

	public static void main(String[] args) throws Throwable {
		
		addToCartBasedOnIndex(0);
	}
		public static void addToCartBasedOnIndex(int index) throws Throwable {
			
			
			System.setProperty("webdriver.chrome.driver", "C:\\ECLIPSE\\Selenium-Workspace\\TestngSample\\driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
			
			//Thread.sleep(3000);
			
			WebElement inputBox = driver.findElement(By.id("twotabsearchtextbox"));
			inputBox.sendKeys("iPhone 7",Keys.ENTER);
			
			//Thread.sleep(5000);
			
			List<WebElement> elements = driver.findElements(By.xpath("//h2[contains(text(),'iPhone 7')]"));
			elements.get(index).click();
			
			List<WebElement> elements_1 = driver.findElements(By.xpath("//a[contains(@title,'Apple iPhone 7')]"));
			String attribute = elements_1.get(index).getAttribute("href");
			
			System.out.println(attribute);
		   
			
		    driver.switchTo().window(attribute);
			
			driver.findElement(By.id("add-to-cart-button")).click();
					
		}		

	}

