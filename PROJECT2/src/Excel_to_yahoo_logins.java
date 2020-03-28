import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Excel_to_yahoo_logins {

	
	    public static void main(String[] args) throws Exception {
		
		//fileinputstream fn = new fileinputstream("d:\\VENKATADRI SIR  SELENIUM\\21JAN2020_TESTNG\data1.xlsx");
		 
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://login.yahoo.com/?.src=ym&.lang=en-IN&.intl=in&.done=https%3A%2F%2Fin.mail.yahoo.com%2Fd");
		driver.findElement(By.name("username")).sendKeys("vktvenkat33");
		driver.findElement(By.name("signin")).click();
		Thread.sleep(4000);
		driver.findElement(By.name("password")).sendKeys("Testing@1234");
		driver.findElement(By.name("verifyPassword")).click();
		Thread.sleep(4000);
		
		//if(driver.findElement(By.linkText("signout")).isDisplayed())
			
		if(driver.findElement(By.cssSelector("a.e_dRA")).isDisplayed())
			
			//a.e_dRA   ------we get by ---r.click on element---inspect element-----rclick---copy css path
			
				{
			
			
			
				System.out.print("login  successfull");
				
				
				}
		
		
		
		
		

	}

}
