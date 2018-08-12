package testpack;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Aug06WinHandle1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\home\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver,20);
		driver.get("https://www.lvbankonline.in/lvbretail/RetailLogin.html");
		driver.findElement(By.xpath("//a[@href='javascript:forgetPassword();']")).click();
		String parWin = driver.getWindowHandle();
		Set<String> allWin= driver.getWindowHandles();
		System.out.println(allWin);
		for (String x : allWin) {
			if(!parWin.equals(x)) {
				driver.switchTo().window(x);
			}
		}
		WebElement child = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@href='javascript:resetPassword();'])[2]")));
		child.click();
		driver.findElement(By.xpath("//input[@id='fldUId']")).sendKeys("123456",Keys.ENTER);
		String textMsg = driver.findElement(By.xpath("//table[4]/tbody/tr[1]/td[1]")).getText();
		System.out.println(textMsg);
		driver.quit();
	}
}
