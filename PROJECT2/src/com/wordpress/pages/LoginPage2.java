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
public class LoginPage2 {
	
	
	
	WebDriver driver ;
	
	
	
	        By username = By.id("user_login");
	        By pwd = By.xpath(".//*[@id='user_pass']");
	        By loginbutton = By.name("wp-submit");
	        
	        
	        
	    public LoginPage2(WebDriver driver) 
	    {
	
          this.driver = driver;
          
	    }
	    
	    
	    public void typeUsername(String uid)
	    {
	    	
	    driver.findElement(username).sendKeys(uid);	// admin is the username in WORDPRESS WEBSITE
	    }
	    
	    public void typePassword(String paswd)
	    {
	    	
	    	driver.findElement(pwd).sendKeys(paswd);// this is the password for this webiste 
	    }
	    
	    public void typeClickonLoginButton()
	    {
	    	driver.findElement(loginbutton).click();
	    }
	    
	    
	    
	    
	    	    
	    
	    
}
