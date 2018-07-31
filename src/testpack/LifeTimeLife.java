package org.test.SampleTestng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LifeTimeLife {
	WebDriver driver;
	@BeforeClass
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\ECLIPSE\\Selenium-Workspace\\TestngSample\\driver\\chromedriver.exe");
    	driver = new ChromeDriver();    
    	driver.manage().window().maximize();
	}
	@Test
	public void LifeTime() throws InterruptedException {
		driver.get("https://www.lifetime.life/");
		//Print the Menu in lifetime.life Homepage.
		List<WebElement> elements = driver.findElements(By.xpath("//ul[contains(@id,'primaryNav')]//following-sibling::li[contains(@class,'nav-item')]"));
		for (WebElement webElement : elements) {
			System.out.println(webElement.getText());			
		}
		
		//Click on Sports and then Basketball.
		driver.findElement(By.xpath("//a[@href='/sports-programs.html']")).click();
		driver.findElement(By.xpath("//ul[@class='list-unstyled dropdown-columns']//child::a[@href='/sports-programs/basketball.html']")).click();
		
		//To Scroll down to "Premier Basketball Courts" and print it. (Doesn't work, need to check the code.)
		JavascriptExecutor j = (JavascriptExecutor) driver;
		WebElement elements1 = driver.findElement(By.xpath("//h4[text()='Premier Basketball Courts']"));
	    
	    j.executeScript("argument[0].scrollIntoView(true)", elements1);
	    String str = elements1.getText();
	    System.out.println(str);
	}
}
