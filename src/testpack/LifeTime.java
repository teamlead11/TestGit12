public class LifeTime {
	WebDriver driver;
	@BeforeClass
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\ECLIPSE\\Selenium-Workspace\\TestngSample\\driver\\chromedriver.exe");
    	driver = new ChromeDriver();    
    	driver.manage().window().maximize();
	}
	@Test
	public void LifeTime() throws InterruptedException {
		driver.get("https://www.lifetime.life/");
	
		List<WebElement> ele = driver.findElements(By.xpath("//ul[contains(@id,'primaryNav')]//following-sibling::li[contains(@class,'nav-item')]"));
		for (WebElement webElement : ele) {
			System.out.println(webElement.getText());			
		}
		
		//Click on Sports and then Basketball.
		driver.findElement(By.xpath("//a[@href='/sports-programs.html']")).click();
		driver.findElement(By.xpath("//ul[@class='list-unstyled dropdown-columns']//child::a[@href='/sports-programs/basketball.html']")).click();
		
		//To Scroll down to "Premier Basketball Courts" and print it. (Doesn't work, need to check the code.)
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement ele1 = driver.findElement(By.xpath("//h4[text()='Premier Basketball Courts']"));
	    
	    js.executeScript("argument[0].scrollIntoView(true)", ele1);
	    String strng = ele1.getText();
	    System.out.println(strng);
	}
}