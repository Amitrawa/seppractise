package amit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

public class Basics {

	WebDriver driver;
	ChromeOptions options;

	@BeforeMethod
	public void setup() {
		
		options = new ChromeOptions();
		options.addArguments("--start-maximized","--incognito","--ignore-invalid-certs");
		driver = new ChromeDriver(options);
		driver.navigate().to("https://www.jenkins.io/");
	}
	
	
	//@Test
	public void clickDownload() throws InterruptedException {
		
		String jenkinsHomeUrl = driver.getCurrentUrl();
		System.out.println("Jenkins Home URL : "+jenkinsHomeUrl);
		driver.findElement(By.xpath("//a[normalize-space()='Download']")).click();
		String downloadPageUrl = driver.getCurrentUrl();
		System.out.println("Current URL Download : "+downloadPageUrl);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		String pageTitle = driver.getTitle();
		System.out.println("Page Title : "+pageTitle);
		
		
	}
	
	@Test
	public void clickDocumentation() {
		
		driver.findElement(By.xpath("//jio-navbar[@id='ji-toolbar']")).getShadowRoot()
		                   .findElement(By.xpath("//button[@type='button']")).click();
		
		
		
	}

	@AfterMethod
	public void terDown() {
		
		driver.close();
	}
	
}
