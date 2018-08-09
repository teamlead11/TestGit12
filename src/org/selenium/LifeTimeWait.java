package org.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LifeTimeWait {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Am Gracy\\eclipse\\TestGit12\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.lifetime.life/");
		
		driver.findElement(By.linkText("Locations")).click();
		driver.findElement(By.linkText("All Locations")).click();
		
		driver.findElement(By.id("locationInput")).sendKeys("California",Keys.ENTER);
		
		WebDriverWait w = new WebDriverWait(driver, 10);

		w.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//p[text()='Folsom']"))));
		w.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[contains(@href,'clubId=245')]"))));
		driver.findElement(By.xpath("//a[contains(@href,'clubId=245')]")).click();
			
	}
	}

