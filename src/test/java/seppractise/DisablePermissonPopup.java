package seppractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DisablePermissonPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//DIsable notification and we didinot get any popup for notification
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notifications");
		//options.addArguments("disable-geolocation");  		// to disable location popup
		//options.addArguments("disable-media-stream");		//To disable media stream



		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();

		driver.get("https://www.spicejet.com/");
		
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n']//div//div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-5njf8e r-1otgn73']//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']")).click();


		 for (int i=1; i<=5;i++)
		 {
			 driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-k8qxaj r-d9fdf6']//div[1]//div[2]//div[3]//*[name()='svg']")).click();
		 }
				
				
				
		driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-d9fdf6 r-1w50u8q r-ah5dr5 r-1otgn73'])[1]")).click();



	}

}
