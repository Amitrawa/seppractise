package seppractise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAutoSuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

WebDriver driver= new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("autosuggest")).sendKeys("IND");
		Thread.sleep(3000);
		

		List <WebElement> options = (List<WebElement>) driver.findElements(By.cssSelector("li[class=\"ui-menu-item\"] a"))	;	

		for(WebElement option :options)
		{
		
			if(option .getText().equalsIgnoreCase("India"))
				{
			option.click();
			
		}
		
		}
		
		
	}

}
