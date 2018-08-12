package testpack;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Aug09WaitTask1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\home\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver,20);
		driver.get("https://www.bobcat.com/safety-training/resources/courses");
		WebElement clk = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Rental Condition & Delivery Report - Utility Vehicles ']")));
		clk.click();
		String parWin = driver.getWindowHandle();
		Set<String> allWin = driver.getWindowHandles();
		for (String x : allWin) {
			if(!parWin.equals(allWin)) {
				driver.switchTo().window(x);
			}
		}
		String s = driver.getTitle();
		System.out.println(s);
		driver.close();
	}
}
