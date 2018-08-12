package testpack;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Aug09WaitTask2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\home\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver,20);
		driver.get("https://www.lifetime.life/");
		driver.findElement(By.xpath("(//a[@class=' nav-link    dropdown-toggle'])[7]")).click();
		//Alert al = driver.switchTo().alert();
		//al.dismiss();
		driver.findElement(By.xpath("//a[text()='All Locations']")).click();
		WebElement txtBx = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='locationInput']")));
		txtBx.sendKeys("Manhattan, New York, NY, USA");
		WebElement search = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Search']")));
		search.click();
	}

}
