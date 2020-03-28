package myproj;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Fb_reg 
{

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.findElement(By.name("firstname")).sendKeys("abcd");
		//lastname
		//email
		//pwd
		new Select(driver.findElement(By.id("day"))).selectByVisibleText("6");
		new Select(driver.findElement(By.id("month"))).selectByVisibleText("May");
		new Select(driver.findElement(By.id("year"))).selectByVisibleText("1992");
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();

	}

}
