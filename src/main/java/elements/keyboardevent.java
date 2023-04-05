package elements;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboardevent {
	
WebDriver driver;
By USERNAME_FIELD = By.xpath("//input[@id='username']");
By PASSWORD_FIELD = By.xpath("//*[@id=\"password\"]");
By SIGNIN_FIELD = By.xpath("/html/body/div/div/div/form/div[3]/button");
	
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
	driver.findElement(USERNAME_FIELD).sendKeys("demo@techfios.com");
	driver.findElement(PASSWORD_FIELD).sendKeys("abc123");
	driver.findElement(SIGNIN_FIELD).click();

Actions action = new Actions(driver);
//action.sendKeys(Keys.ENTER).build().perform();
action.sendKeys(Keys.RETURN).build().perform();
KEYS.
}}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	