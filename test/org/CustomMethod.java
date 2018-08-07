package test.org;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomMethod {

		public static void main(String[] args) throws InterruptedException {
			gotoHomePage(3);
		}

		public static void gotoHomePage(int mobileWebElementIndex) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver",
					"D:\\SELINIM.Praveen.ConcertCare1\\SampleTest\\driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();

			driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//button[@class=\"_2AkmmA _29YdH8\"]")).click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("iphone", Keys.ENTER);
			List<WebElement> childelements = driver.findElements(By.xpath("//div[@class='_3wU53n']"));
			childelements.get((mobileWebElementIndex - 1)).click();

		}


}
