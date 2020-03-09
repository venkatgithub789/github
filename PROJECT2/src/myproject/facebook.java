package myproject;


// WRITE PROGRAM  FOR FINDING ALL FRIENDS LIST IN FACEBOOK,AFTER LOGIN


import java.awt.event.ActionEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.openqa.selenium.chrome.ChromeDriver;// chromeDriver class (interface class) 
//import org.openqa.selenium.remote.BrowserType;
//import org.openqa.selenium.remote.server.handler.FindElement;




public class facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ChromeDriver drv  = new ChromeDriver();//creating a object from chromeDriver class
		 drv.get("https://www.facebook.com/");
		 
		 drv.findElement(By.name("email")).sendKeys("vktvenkat33@gmail.com");
		 drv.findElement(By.name("pass")).sendKeys("sai@baba@217");
		 drv.findElement(By.id("loginbutton")).click();
		// drv.getWindowHandle();
		 
		// driver = new FirefoxDriver();
		   drv.manage().window().maximize();// for maximizing the window 
		   //drv.close();
		   
		   
		   drv.findElement(By.id("findFriendsNav")).click();
		   //new ActionEvent().sendKeys(Keys.ESCAPE).build().perform();
		   
		   //browser.keys("Escape");// to dissmiss notifictaion dialouge box
		   	  
		   
		
	}

}
