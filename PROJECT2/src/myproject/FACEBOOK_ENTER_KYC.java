package myproject;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FACEBOOK_ENTER_KYC {

	public static void main(String[] args) throws Exception {
		
		
		ChromeDriver obj = new ChromeDriver();
		
		obj.get("https://facebook.com");
		
		obj.findElement(By.name("email")).sendKeys("vktvenkat33@gmail.com");
		obj.findElementByName("pass").sendKeys("sai@baba@217");
		obj.findElementById("loginbutton").click();
				
		Thread.sleep(5000);
		obj.manage().window().maximize();
		
		Thread.sleep(5000);
		
		//obj.close();	
		
		
		
		
		

	}

}
