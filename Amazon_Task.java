package window;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Task {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\WindowHandling\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("iphone x", Keys.ENTER);
		WebElement phone = driver.findElement(
				By.xpath("//a[@class='a-link-normal s-access-detail-page  s-color-twister-title-link a-text-normal']"));
		phone.click();
		// parent ID
		String pwid = driver.getWindowHandle();
		System.out.println(pwid);
		
		Set<String> cwid = driver.getWindowHandles();
		System.out.println(cwid);
		for (String x : cwid) {
			if(!pwid.equals(x)) {
				driver.switchTo().window(x);
			}
			
		}
		Thread.sleep(2000);
		WebElement cl = driver.findElement(By.xpath("//input[@class='a-button-input']"));
		cl.click();
		WebElement string = driver.findElement(By.xpath("//span[@class='a-color-price hlb-price a-inline-block a-text-bold']"));
		System.out.println(string.getText());
	}

}
