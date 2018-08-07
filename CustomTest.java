package org.maven.project;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomTest {

	static WebDriver driver;

	public static void goToPage(String pageNum) {

		System.setProperty("webdriver.chrome.driver", "D:\\JK\\SeleniumLearning\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.MILLISECONDS);
		driver.get("https://www.google.co.in/");
		System.out.println("Scenario 1: Pagination");
		driver.findElement(By.className("gsfi")).sendKeys("selenium", Keys.ENTER);
		WebElement parentElement = driver.findElement(By.xpath("//table[contains(@id, nav)]//tr"));
		List<WebElement> childElement = parentElement.findElements(By.xpath("//td//a"));
		System.out.println("ChildElement Size is:" + childElement.size());
		for (int i = 0; i < childElement.size(); i++) {
			if (childElement.get(i).getText().equals(pageNum)) {
				childElement.get(i).click();
				break;
			}
		}
		
		driver.quit();
	}

	public static void addToCart(int prdtIndex) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\JK\\SeleniumLearning\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.MILLISECONDS);
		driver.get("https://www.flipkart.com/");
		WebElement popUpClose = driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		popUpClose.click();
		driver.findElement(By.xpath("//input[@class='LM6RPg']")).sendKeys("one plus", Keys.ENTER);
		

		List<WebElement> mobElements = driver.findElements(By.xpath("//div[@class='_1vC4OE _2rQ-NK']"));
		mobElements.get(prdtIndex - 1).click();

		String pWind = driver.getWindowHandle();
		System.out.println(pWind);

		Set<String> allWindows = driver.getWindowHandles();
		System.out.println(allWindows);

		for (String g : allWindows) {

			if (!pWind.equals(g)) {
				driver.switchTo().window(g);
			}
		}

		driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")).click();
		driver.quit();

	}

	public static void main(String[] args) throws InterruptedException {

		goToPage("9");
		//addToCart(5);

	}

}
