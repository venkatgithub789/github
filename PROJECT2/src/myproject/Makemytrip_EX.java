package myproject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

/*import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;*/

public class Makemytrip_EX {

	public static void main(String[] args) throws Exception {
		
		
	/*	FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		
		WebElement from=driver.findElement(By.xpath("//input[@id='fromCity']"));
		from.click();
		from=driver.findElement(By.xpath("//input[@placeholder='From']"));
		from.sendKeys("Hyderabad");
		Thread.sleep(2000);
		from.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		from.sendKeys(Keys.ENTER);
		
		WebElement to=driver.findElement(By.xpath("//input[@placeholder='To']"));
		to.sendKeys("Bengaluru");
		Thread.sleep(2000);
		to.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		to.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		WebElement cal=driver.findElement(By.xpath("//div[@class='DayPicker-Months']/div[1]"));
		while(cal.findElement(By.xpath("div/div")).getText().matches("May 2020")==false)
		{
			driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			Thread.sleep(1000);
		}
		cal.findElement(By.xpath("//p[text()='10']")).click();

		driver.findElement(By.xpath("//div[@data-cy='flightTraveller']")).click();
		driver.findElement(By.xpath("//div[@class='travellers']/div/ul/li[3]")).click();
		driver.findElement(By.xpath("//button[text()='APPLY']")).click(); */

		
		ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com");
		
		//driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div/div[1]/ul/li[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[1]/ul/li[2]")).click();// click on roundtripbutton
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div/div[1]/ul/li[1]")).click();// click on ONEWAY
		
		Thread.sleep(3000);

		WebElement  from =driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div/div[2]/div[1]/div[1]/label")); //Click on FROM
		from.click();
		from=driver.findElement(By.xpath("//input[@placeholder='From']"));
		from.sendKeys("Hyderabad");
		Thread.sleep(2000);
		from.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		from.sendKeys(Keys.ENTER);
		
		Thread.sleep(3000);
		WebElement to=driver.findElement(By.xpath("//input[@placeholder='To']"));
		to.sendKeys("Bengaluru");
		Thread.sleep(2000);
		to.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		to.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		
		//*[@id="root"]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]
		//WebElement cal=driver.findElement(By.xpath("//[@id='root']/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]"));
		
		WebElement cal=driver.findElement(By.xpath("//div[@class='DayPicker-Months']/div[1]"));
		
		while(cal.findElement(By.xpath("div/div")).getText().matches("May 2020")==false)
		{
			driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			Thread.sleep(1000);
		
		}
		
		
		/*cal.findElement(By.xpath("//p[text()='10']")).click();
		
		driver.findElement(By.xpath("//div[@data-cy='flightTraveller']")).click();
		driver.findElement(By.xpath("//div[@class='travellers']/div/ul/li[3]")).click();
		driver.findElement(By.xpath("//button[text()='APPLY']")).click();
		
		
		
		
		
		}	
		
		
*/
	}

}
