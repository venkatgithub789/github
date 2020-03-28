/*
*EXAMPLES OF OTWANI BANGALORE
*
*
 * 
 */
package com.wordpress.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author venkata subrahmanyam
 * 
 * This class will store all the Locators and methods of Login Page.(ie here we are defining entire things of loginpage)
 *
 */
public class LoginPage {
	
	
	
	WebDriver driver ;
	
	
	
	        By username = By.id("user_login");
	        By pwd = By.xpath(".//*[@id='user_pass']");
	        By loginbutton = By.name("wp-submit");
	        
	        
	        
	    public LoginPage(WebDriver driver) 
	    {
	
          this.driver = driver;
          
	    }
	    
	    
	    public void typeUsername()
	    {
	    	
	    driver.findElement(username).sendKeys("admin");	// admin is the username in WORDPRESS WEBSITE
	    }
	    
	    public void typePassword()
	    {
	    	
	    	driver.findElement(pwd).sendKeys("demo123");// this is the password for this webiste 
	    }
	    
	    public void typeClickonLoginButton()
	    {
	    	driver.findElement(loginbutton).click();
	    }
	    
	    
	    
	    
	    	    
	    
	    
}
