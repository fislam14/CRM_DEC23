package elements;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c5learnwindowhandle {
WebDriver driver;
	
	
	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Farhan\\Desktop\\selenium\\crm\\driver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.yahoo.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);}
	
	public void testWindowHandle() {
		String title1= driver.getTitle();
		System.out.println(title1);
		driver.findElement(By.xpath("//*[@id=\"ybar-sbq\"]")).sendKeys("selenium");
		driver.findElement(By.xpath("//*[@id=\"ybar-search\"]")).click();
		
		;
}
}