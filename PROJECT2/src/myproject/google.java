package myproject;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;




public class google {

	public static void main(String[] args) {
		
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		WebElement x = driver.findElement(By.name(EMAIL));
		
		
		
			
		
	}

}
