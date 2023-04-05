package variousconcepts;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginTest_Junit {

	WebDriver driver;
	@BeforeClass
	public static void beforeClass() {
		System.out.println("b4class");}
	@AfterClass
	public static void afterClass() {
		System.out.println("afterclass");}
	
	@Before 
	public   void init() {
		System.out.println("init");
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Farhan\\Desktop\\selenium\\crm\\driver\\chromedriver.exe");
	 driver = new ChromeDriver();
			driver.get("http://www.techfios.com/billing/?ng=admin/ ");
			driver.manage().window().maximize();
		//	driver.manage().timeouts()
			}
			
			
			@Test
			public void loginTest() {
				
			 	System.out.println("loginTest");
					driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
			driver.findElement(By.id("password")).sendKeys("abc123");
			driver.manage().window().maximize();
			driver.findElement(By.name("login")).click();}
			
			public void negLoginTest() {
				System.out.println("neglog");
				driver.findElement(By.id("username")).sendKeys("ddg");
				driver.findElement(By.id("password")).sendKeys("abc123");
				driver.findElement(By.name("login")).click();}
			
				
			
			@After
			public void tearDown() {
				System.out.println("teardown");
			driver.close();
			} 
			
	}

