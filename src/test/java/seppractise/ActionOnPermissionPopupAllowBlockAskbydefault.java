package seppractise;

import java.util.Arrays;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ActionOnPermissionPopupAllowBlockAskbydefault {

	public static void main(String[] args) {

		
		ChromeOptions options = new ChromeOptions();

		HashMap<String, Integer> conentSettings = new HashMap<String,Integer>();
		HashMap<String, Object> profile =new HashMap<String , Object>();
		HashMap<String, Object> prefs= new HashMap<String, Object>();
		
		//conentSettings.put("geolocation", 2);

		conentSettings.put("notification", 2);
		profile.put("managed_default_content_settings", conentSettings);
		prefs.put("profile", profile);
		options.setExperimentalOption("prefs", prefs);
		
		
		//conentSettings.put("geolocation", 2);
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();


		
		driver.get("https://www.spicejet.com/");

		
	}

}
