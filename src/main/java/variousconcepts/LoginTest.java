package variousconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class LoginTest {
 static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

init();
loginTest();
tearDown();

init();
negLoginTest();
tearDown();
	}
		public static void init() {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Farhan\\Desktop\\selenium\\crm\\driver\\chromedriver.exe");
 driver = new ChromeDriver();
		driver.get("http://www.techfios.com/billing/?ng=admin/ ");
		driver.manage().window().maximize();
		}
		
		
		
		public static void loginTest() {
			
		 	
				driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.manage().window().maximize();
		driver.findElement(By.name("login")).click();}
		
		public static void negLoginTest() {
			driver.findElement(By.id("username")).sendKeys("ddg");
			driver.findElement(By.id("password")).sendKeys("abc123");
			driver.findElement(By.name("login")).click();}
		
			
		
		
		public static void tearDown() {
		driver.close();
		} 
		
}
