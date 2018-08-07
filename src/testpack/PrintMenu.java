package testpack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class PrintMenu {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\programs\\Browser\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.lifetime.life/");
		driver.manage().window().maximize();
		
		List<WebElement> menus = driver.findElements(By.xpath("//ul[contains(@class, 'nav nav-neutral')]//a[contains(@class, 'nav-link')]"));
		
		int count = menus.size();
		
		for(int i = 0; i<count-1; i++){
			WebElement value = menus.get(i);
			String text = value.getText();
			
			System.out.println("Menus are " + text);
		}
		WebElement sports = driver.findElement(By.xpath("//*[@id='primaryNav']/li//following::a[contains(@href, 'sports')]"));
		sports.click();
				
		WebElement basketball = driver.findElement(By.xpath("//a[contains(@href, 'basketball.html')]"));
		basketball.click();
				
		Thread.sleep(2000);
		String text = driver.findElement(By.xpath("//div[contains(@class, 'col-xs-12')]/h4")).getText();
		System.out.println("Text : " + text);
				
	}
}
