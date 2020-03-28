package myproject;

	
	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;

	
	public class firefox1
	{
	
	public static void main(String[] args)
	
	{
		// TODO Auto-generated method stub

		
		
	       FirefoxDriver driver = new FirefoxDriver();
			driver.get("http://www.google.com");
			
			//WebElement x=driver.findElement(By.name("q"));
			//x.sendKeys("selenium");
			
			driver.findElement(By.name("q")).sendKeys("selenium");
			driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

}

	
}