package test.org;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\SELINIM.Praveen.ConcertCare1\\SampleTest\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.lifetime.life/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class=\"nav nav-neutral\"]//following::a"));
		for (WebElement x : list) {
			System.out.println(x.getText());
		}
	}
}
