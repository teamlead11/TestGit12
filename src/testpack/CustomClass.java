package org.test.CustomMethodClass;


import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomClass {

	public static void main(String[] args) throws Throwable {
		
		addToCartBasedOnIndex(1);
		
	}
	
	
	public static void addToCartBasedOnIndex(int index) throws Throwable {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Greens-15\\Pradeepa\\CustomMethodClass\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("sumsung mobile",Keys.ENTER);
		
		Thread.sleep(5000);
		
		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='_3wU53n']"));
		
		elements.get((index-1)).click();
	   
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs2.get(1));
		
		driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")).click();
				
	}
	
}
