package org.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;




public class BobWait {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Am Gracy\\eclipse\\TestGit12\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();


		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.bobcat.com/safety-training/resources/courses");
		driver.findElement(By.linkText("Accept and Close")).click();
		driver.findElement(By.xpath("(//i[@class='fa fa-sort'])[2]")).click();
		driver.findElement(By.xpath("//a[@href='#Utility Vehicles']")).click();
		

		WebDriverWait w = new WebDriverWait(driver, 60);
		w.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//img[contains(@alt,'Rental Condition')]"))));

		driver.findElement(By.xpath("//img[contains(@alt,'Rental Condition')]")).click();

		WebElement txtRental = driver.findElement(By.xpath("//h3[@class='light-title']"));
		w.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h3[@class='light-title']"))));

		System.out.println(txtRental.getText());

	}
}
