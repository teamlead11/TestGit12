package testpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Lifetimelife {
	WebDriver driver;
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "F:\\programs\\Browser\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.lifetime.life/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[@class=' nav-link    dropdown-toggle'])[7]")).click();
        driver.findElement(By.xpath("//a[text()='All Locations']")).click();
     WebElement country=driver.findElement(By.id("locationInput"));
     country.sendKeys("dallas",Keys.ENTER);
   WebDriverWait wait = new WebDriverWait(driver, 10);
    wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//p[text()='Dallas - Highland Park']"))));
   wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[contains(@href,'clubId=190&')]"))));
driver.findElement(By.xpath("//a[contains(@href,'clubId=190&')]")).click();




		



		}

		}


