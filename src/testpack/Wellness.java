package testpack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wellness {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\programs\\Browser\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.lifetime.life/");
		driver.manage().window().maximize();
		WebElement Wellness = driver.findElement(By.xpath("//a[contains(@href, 'wellness.html')]"));
		Wellness.click();	
		WebElement corporate = driver.findElement(By.xpath("//a[contains(@href, 'corpo')]"));
		corporate.click();	
		Thread.sleep(2000);
		String txt= driver.findElement(By.xpath("//h2[contains(text(),'A Few of Our Corporate Partners')]")).getText();
		System.out.println("our partners :"+ txt);
		List<WebElement> partners = driver.findElements(By.xpath("//div[@class='content-section p-t-5 p-b-5']//div[@class='row']//img"));
		int count = partners.size();
		for (int i = 0; i<count ; i++){
			WebElement icon = partners.get(i);
			String s = icon.getAttribute("src");
			s = s.replace("https://www.lifetime.life/content/dam/ltp/images/corporate/corporate-wellness/", " ");
		s =s.replace(".svg", " ");
			System.out.println("Ours Partners are : " + s);
		}	
	}
}
