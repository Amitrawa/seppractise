package seppractise;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class dynamicDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notifications");
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input[@value='Delhi (DEL)'])[1]")).click(); //click on delhi
		driver.findElement(By.xpath("(//div[@class='css-76zvg2 r-cqee49 r-ubezar r-1kfrs79 r-1ozqkpa'])[1]")).click();//click on india
		WebElement targetElement=driver.findElement(By.xpath("//div[55]"));// store nagpur in target elemt
		
		Actions actions =new Actions(driver);
		actions.scrollToElement(targetElement).perform(); ///scroll till nagpur
		driver.findElement(By.xpath("//div[55]")).click();  // click on nagpur
		
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).click();  // click on to field
		WebElement target1Element =driver.findElement(By.xpath("(//div[contains(text(),'CCU')])[1]"));  //store kolkata in target elemt
		Actions actions1 =new Actions(driver);
		actions1.scrollToElement(target1Element).perform(); ///scroll till kolkata
		driver.findElement(By.xpath("(//div[contains(text(),'CCU')])[1]")).click();
		
		driver.findElement(By.cssSelector("div[class='css-76zvg2 r-jwli3a r-ubezar r-16dba41']")).click();
		
		
		

		
		
	
	}

}
