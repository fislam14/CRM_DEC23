package elements;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class learniframe {
WebDriver driver;
	
	
	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Farhan\\Desktop\\selenium\\crm\\driver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://docs.oracle.com/javase/8/docs/api/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);}
	

@Test
public void testIFrame() {
	driver.switchTo().frame("packageListFrame");
	driver.findElement(By.linkText("java.awt")).click();
	driver.switchTo().parentFrame();
	driver.switchTo().frame("packageFrame");
	driver.findElement(By.linkText("Adjustable")).click();

	
	
	
	
}
}
