package window;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Filpkart_Task {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\HP\\eclipse-workspace\\WindowHandling\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com");

		WebElement btn = driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8\']"));
		btn.click();

		WebElement search = driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
		search.sendKeys("iphone 7");

		WebElement btn2 = driver.findElement(By.xpath("//button[@class='vh79eN']"));
		btn2.click();

		Thread.sleep(3000);

		String ParentID = driver.getWindowHandle();

		WebElement btn3 = driver.findElement(By.xpath("//div[@class='_3wU53n']"));
		btn3.click();

		Thread.sleep(3000);
		java.util.Set<String> allWindows = driver.getWindowHandles();

		for (String X : allWindows) {
			if (!ParentID.equals(X)) {
				driver.switchTo().window(X);
				System.out.println(X);
			}
		}

		Thread.sleep(3000);

		WebElement btn4 = driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']"));
		btn4.click();

		Thread.sleep(3000);

		WebElement price = driver.findElement(By.xpath("//div[@class='_3xFQAD']"));
		String pr = price.getText();
		System.out.println(pr);

	}

}
