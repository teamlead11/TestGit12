package org.maven.project;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	static WebDriver driver;

	public static void openBrowser() {

		System.setProperty("webdriver.chrome.driver", "D:\\JK\\SeleniumLearning\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(200, TimeUnit.MILLISECONDS);
		driver.get("https://www.amazon.in/");
		

	}

	public static void closeBrowser() {

		driver.close();
		driver.quit();

	}

}
