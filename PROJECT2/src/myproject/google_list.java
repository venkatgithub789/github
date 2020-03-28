package myproject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
// program to select the drop down list from google main page 

public class google_list {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		
		//WebElement  x =  driver.findElement(By.name("q"));
		//x.sendKeys("selenium"); or we can write these two lines as below
		
		driver.findElement(By.name("q")).sendKeys("selenium");
		
		Thread.sleep(2000);
		
		    
		
		driver.findElement(By.xpath("//ul[@role='listbox']/li[3]"));
		
		//driver.findElement(By.xpath("//form[@id='tsf']/div[2]/div[1]/div[2]/div[2]/ul/li[3]/div/div[2]"));	
		// i used this code from inspect element  code,right click xpath . and this also works fine
		
		                       //or  we use second way to select the 3rd list of google seacrh of an item .ie,
		
		  driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
		  Thread.sleep(2000);
		  driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
		  Thread.sleep(2000);	
		  driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
		  Thread.sleep(2000);	
		
				
		  driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		  
		  Thread.sleep(10000);
		  driver.close();
		
		
		
		
		

	}

}