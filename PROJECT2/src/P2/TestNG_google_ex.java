package P2;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_google_ex 

{
	
	WebDriver driver ;
	
	@Test
	@Parameters({"x"})
	public void search(String str)
    
    {
	
    	if(str.matches("firefox"))
		{
			driver = new FirefoxDriver();
		}
		if(str.matches("chrome"))
		{
			driver = new ChromeDriver();
		}
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("selenium");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    	
    	
    }

}
