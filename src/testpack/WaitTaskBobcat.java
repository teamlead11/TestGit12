package testpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitTaskBobcat {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\ECLIPSE\\Selenium-Workspace\\TestGit12\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bobcat.com/safety-training/resources/courses");
		driver.findElement(By.cssSelector(".dropdown-toggle"));

	}

}
