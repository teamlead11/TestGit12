package waits.org;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sample_Waits {
	public static void main(String[] args) {

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
				"D:\\SELINIM.Praveen.ConcertCare.Project\\waits\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.bobcat.com/sea/en/utility/uv/models");
		driver.manage().window().maximize();

		WebElement alert = driver.findElement(By.xpath("//strong[text()='Accept and Close']"));
		alert.click();
		driver.findElement(By.xpath("//a[text()='Utility Products']")).click();
		WebElement dropdown = driver.findElement(By.xpath("(//span[@class=\"dtm-pro-grp-txt-name\"])[7]"));
		WebDriverWait waitobj = new WebDriverWait(driver, 10);
		waitobj.until(ExpectedConditions.visibilityOf(dropdown));
		dropdown.click();
		driver.findElement(By.xpath("(//p[text()='Vehicle Rated Capacity: 861 kg'])[2]")).click();
		WebElement title = driver.findElement(By.xpath("//*[@id=\"1475818522991\"]/section/div[1]/div/h2"));
		WebDriverWait waitobj1 = new WebDriverWait(driver, 20);
		waitobj1.until(ExpectedConditions.visibilityOf(title));
		System.out.println("Title of the page is:"+title.getText());
		
		
		
	}
}
