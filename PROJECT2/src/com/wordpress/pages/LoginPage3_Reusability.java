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
 * example for Reusability
 */
public class LoginPage3_Reusability {
	
	
	
	WebDriver driver ;
	
	
	
	        By username = By.id("user_login");
	        By pwd = By.xpath(".//*[@id='user_pass']");
	        By loginbutton = By.name("wp-submit");
	        
	        
	        
	    public LoginPage3_Reusability(WebDriver driver) 
	    {
	
          this.driver = driver;
          
	    }
	    
	    
	    public void logintowordpress(String uname,String Pwrd)
	    {
	    	
	    	driver.findElement(username).sendKeys(uname);
	    	driver.findElement(pwd).sendKeys(Pwrd);
	    	driver.findElement(loginbutton).click();
	    	
	    }
	    
	    
	  
	    
	    
	    	    
	    
	    
}
