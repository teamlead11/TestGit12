package testpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BobCat {
	
		WebDriver driver;
		public static void main(String[] args)  {
			System.setProperty("webdriver.chrome.driver", "F:\\programs\\Browser\\Drivers\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://www.bobcat.com/safety-training/resources/courses");
			driver.manage().window().maximize();
			WebElement p=driver.findElement(By.xpath("//strong[text()='Accept and Close']"));
			p.click();
			WebElement ele=driver.findElement(By.xpath("(//i[@class='fa fa-sort'])[2]"));
			ele.click();
             driver.findElement(By.xpath("//a[@data-key='Utility Vehicles']")).sendKeys("Utility Vehicles", Keys.ENTER);
			WebDriverWait wait=new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("(//img[@class='img-responsive media-image'])[3]"))));
			WebElement rent=driver.findElement(By.xpath("(//img[@class='img-responsive media-image'])[3]"));
			rent.click();
			WebElement element = driver.findElement(By.xpath("//h3[@class='light-title']"));
			element.click();
			wait.until(ExpectedConditions.visibilityOf(element));
			System.out.println(element.getText());
	}

}
