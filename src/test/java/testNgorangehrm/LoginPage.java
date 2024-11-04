package testNgorangehrm;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



@Test
public class LoginPage {
	
	String baseUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	WebDriver driver;
	String browser = "chrome";
	
	@BeforeTest
	public void setup() {
		
		
		 ChromeOptions options = new ChromeOptions();
		 options.addArguments("--start-Maximized","--incognito");
		 driver = new ChromeDriver(options);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get(baseUrl);
		
}
	
	
	@Test(priority=2)
	public void loginWithValidCredentials()
	{
	
		WebElement userName = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		userName.sendKeys("Admin");
		
		WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		password.sendKeys("admin123");
		
		WebElement login = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		login.click();
		
	}
	
	@Test(priority=1)
	public void loginWithInvalidCredentials()
	
	{
		WebElement userName = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		userName.sendKeys("Admin");
		
		WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		password.sendKeys("admin1234");
		
		WebElement login = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		login.click();
	}
	
	@AfterTest
	public void tearDown() {
		
		driver.quit();
	}

}
