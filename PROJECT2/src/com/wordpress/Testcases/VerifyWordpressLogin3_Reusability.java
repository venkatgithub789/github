


/**
 * *****************************EXAMPLES OF OTWANI BANG3ALORE************************
 * this program will call methods of website---com.wordepress.pages/loginpage3_Reusablility.java class in line number 33
 * Example for Reusability
 * 
 */
package com.wordpress.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.wordpress.pages.LoginPage;
import com.wordpress.pages.LoginPage3_Reusability;

/**
 * @author venkata subrahmanyam
 *
 */
public class VerifyWordpressLogin3_Reusability {
	
	@Test
	public void verifylogin()
	
	{
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://demosite.center/wordpress/wp-login.php");
		
		LoginPage3_Reusability loginobj = new LoginPage3_Reusability(driver);
		
		loginobj.logintowordpress("admin","demo123");
		
		
		
		driver.quit();
		
		
	}
	
	

}
