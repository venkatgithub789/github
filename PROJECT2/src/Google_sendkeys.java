import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Google_sendkeys {

	
	
	    public static void main(String[] args) throws Exception {
		
	    	
	    ChromeDriver driver = new ChromeDriver();	
		//FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("selenium");
		
		Thread.sleep(10000);
		
		// now to select the "selenium" word from list in google search list we can do in two ways.
		//way-- 1
		//driver.findElement(By.xpath("//ul[@role='listbox']/li[3]")).click();
		//  or  ,  way---2
		
		driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(10000);
		driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(10000);
		driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);	
		Thread.sleep(10000);
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		
		//*[@id="tsf"]/div[2]/div[1]/div[2]/div[2]/ul/li[3]/div/div[2]/div/span
		// xpath for "selenuim" element which is in third , from the list  using down key.this is xpath by, traditional method  
			

	}

}
