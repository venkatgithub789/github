package myproject;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HANDLE_POPUP_TEST {
	
	// HANDLE POPUP WINDOW IN Facebook 
	
	
	@Test
	public void Test() throws Exception
	{
		
		
	//create object of hash map class
		
		Map<String, Object> prefs = new HashMap<String, Object>();
		
		// Now Set the notification setting it will override the default setting
		
		prefs.put("profile.default_content_setting_values.notifications", 2);
		
        // Create object of ChromeOption class
           ChromeOptions options = new ChromeOptions();
		
           // Set the experimental option
           options.setExperimentalOption("prefs", prefs);
           

           // pass the options object in Chrome driver
         
           System.setProperty("webdriver.chrome.driver", "C:\\eclip_zip\\eclipse\\PROJECT2\\chromedriver.exe");
           WebDriver driver = new ChromeDriver(options);
           driver.get("https://www.facebook.com/");
           driver.manage().window().maximize();
           
           driver.findElement(By.name("email")).sendKeys("vktvenkat33@gmail.com");
  		 driver.findElement(By.name("pass")).sendKeys("sai@baba@217");
  		 driver.findElement(By.id("loginbutton")).click();
           
         
   		Thread.sleep(5000);
   		//driver.manage().window().maximize();
   		
   		Thread.sleep(5000);


	
		
			
		
		
		
	}

}
