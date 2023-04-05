package elements;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ellocaturs {
WebDriver driver;
@Before
public void init() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Farhan\\Desktop\\selenium\\crm\\driver\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.get("https://www.techfios.com/billing/?ng=admin/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
@Test
public void loginTest() {
	WebElement usrelem = driver.findElement(By.xpath("//input[@id='username']"));
	WebElement PASSWORD =driver.findElement(By.xpath("//'[@id=\"password\']"));
	WebElement signin_element = driver.findElement(By.xpath("/html/body/div/div/div/form/div[3]/button"));
	//WebElement DASHBOARD_HEADER_FIELD = driver.findElement(By.xpath("//h2{contains(text(), 'Dashboard')]"));
			
	//driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demo@techfios.com");
	
	//usrelem.clear();
	
	usrelem.sendKeys("demo@techfios.com");
	//driver.findElement(USERNAME_FIELD).sendKeys("demo@techfios.com");
	PASSWORD.sendKeys("abc123");
	signin_element.click();
	
	
	WebElement DASHBOARD_HEADER_FIELD = driver.findElement(By.xpath("//h2{contains(text(), 'Dashboard')]"));
	//Assert.assertTrue("Dashboard page not found", DASHBOARD_HEADER_FIELD.isDisplayed());
	
}
}
