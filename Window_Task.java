package window;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Task {
	WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\WindowHandling\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.lvbankonline.in/lvbretail/RetailLogin.html");
		driver.manage().window().maximize();
		WebElement b = driver.findElement(By.xpath("//a[@href=\'javascript:forgetPassword();\']"));
		b.click();
		// parent window
		String pwid = driver.getWindowHandle();
		System.out.println(pwid);
		// all windows
		Set<String> allwid = driver.getWindowHandles();
		System.out.println(allwid);
		for (String x : allwid) {
			if (!pwid.equals(x)) {
				driver.switchTo().window(x);
			}
		}
		WebElement c = driver.findElement(By.xpath("//a[text()='Reset Login password']"));
		c.click();
		int count=0;
		for (String q : allwid) {
			if(count==2) {
				driver.switchTo().window(q);
			}
			count++;
		}
		WebElement A = driver.findElement(By.id("fldUId"));
		A.sendKeys("ertyhnm",Keys.ENTER);
		WebElement text = driver.findElement(By.xpath("//td[@class='ColHeadingLeftAlignedBold']"));
		System.out.println(text.getText());
		driver.quit();
		
	}
}
