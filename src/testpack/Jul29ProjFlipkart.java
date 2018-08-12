package testpack;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Jul29ProjFlipkart {
	public static void main(String[] args) throws InterruptedException {
		flipkart(1);
	}
	public static void flipkart(int index) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\home\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver,15);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		driver.findElement(By.className("LM6RPg")).sendKeys("iphone 6", Keys.ENTER);
		WebElement p = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='_1HmYoV _35HD7C col-10-12']")));
		List<WebElement> element = p.findElements(By.xpath("//div[@class='_3wU53n']"));
		element.get((index - 1)).click();
		//System.out.println(element.size());
		for (int i = 0; i < element.size(); i++) {
			if (element.get(i).getText().equals(index)) {
				element.get(i).click();
				break;
			}
		}
		ArrayList<String> s = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(s.get(1));
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("(//li[@class='col col-6-12'])")).click();
	}
}
