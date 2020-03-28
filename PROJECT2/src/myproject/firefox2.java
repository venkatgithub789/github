package myproject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;





public class firefox2 {

	
	
	
	
	public static void main(String[] args) {
		
		
		//FirefoxDriver drv = new FirefoxDriver();
		ChromeDriver drv = new ChromeDriver();
		drv.get("https://www.google.com");
		 
		WebElement x = drv.findElement(By.name("q"));
		//x.sendKeys("selenium");
		//x.sendKeys(Keys.ENTER);
		
		drv.findElement(By.name("q")).sendKeys("core java");
		drv.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		
	    // drv.close();"
		
		

	}

}
