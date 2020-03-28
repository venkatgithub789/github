


/**
 * EXAMPLES OF OTWANI BANG3ALORE
 * this program will call methods of com.wordepress.pages/loginpage.java class in line number 32
 * 
 */
package com.wordpress.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.wordpress.pages.LoginPage;
import com.wordpress.pages.LoginPage2;

/**
 * @author venkata subrahmanyam
 *
 */
public class VerifyWordpressLogin2 {
	
	@Test
	public void verifylogin()
	
	{
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://demosite.center/wordpress/wp-login.php");
		
		LoginPage2 loginobj = new LoginPage2(driver);
		
		
		loginobj.typeUsername("admin");
		loginobj.typePassword("demo123");
		loginobj.typeClickonLoginButton();
		
		//driver.wait(5000);
		
		driver.quit();
		
		
	}
	
	

}
