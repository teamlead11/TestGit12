package testpack;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Aug06WinHandle3 {
	
	public static void main(String[] args) {
		goToAmazon(1);
	}
	public static void goToAmazon(int index) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\home\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver,20);
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone 7",Keys.ENTER);
		WebElement p = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='_1HmYoV _35HD7C col-10-12']")));
		List<WebElement> element = p.findElements(By.xpath("//div[@class='_3wU53n']"));
		element.get((index - 1)).click();
		for (int i = 0; i < element.size(); i++) {
			if (element.get(i).getText().equals(index)) {
				element.get(i).click();
				break;
			}
		}
	}
}
