package waits.org;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LifeTimeFitnes {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\SELINIM.Praveen.ConcertCare.Project\\waits\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.lifetime.life/");
		driver.manage().window().maximize();

		WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"primaryNav\"]/li[9]"));
		dropdown.click();
		WebElement alllocaltion = driver.findElement(By.xpath("//a[text()='All Locations']"));
		
		/*Actions acc=new Actions(driver);
		Actions element = acc.moveToElement(alllocaltion);
		element.build().perform();
		*/WebDriverWait waitobj1 = new WebDriverWait(driver, 20);
		waitobj1.until(ExpectedConditions.elementToBeClickable(alllocaltion));
		alllocaltion.click();
	
		WebElement search = driver.findElement(By.id("locationInput"));
		search.sendKeys("USA");
		WebDriverWait waitobj2 = new WebDriverWait(driver, 30);
		waitobj2.until(ExpectedConditions.visibilityOf(search));
		
		WebElement new1 = driver.findElement(By.xpath("//*[@id=\"locate-a-club\"]/div[1]/div[1]/div/div[1]/div/form/fieldset/div/span/button"));
		if (!(waitobj2==search)) {
			new1.click();
		}
		
	}
}
