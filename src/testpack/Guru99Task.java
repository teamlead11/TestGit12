package testpack;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99Task {

	public static void main(String[] args) {
		List<String> obj = new ArrayList<String>();
		obj.add("Unit Testing");
		obj.add("Integration Testing");
		obj.add("System Testing");
		obj.add("Smoke and Sanity Testing");

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
				"C:\\ECLIPSE\\Selenium-Workspace\\SeleniumTest1\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.guru99.com/");
		WebElement btnOption = driver.findElement(By.xpath("//a[contains(text(),'Learn Software Testing')]"));
		btnOption.click();
		List<WebElement> allElements = driver.findElements(By.xpath("(//table[@class='table'])[2]//tbody//tr//td[2]"));
		for (int i = 0; i < obj.size(); i++) {
			for (WebElement data : allElements) {
				if(data.getText().equals(obj.get(i))){
					System.out.println(obj.get(i));
				}
			}
		}driver.quit();
	}
}
