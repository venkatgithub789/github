package P2;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import PK1.Fb;

public class facebook_login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		FirefoxDriver driver = new FirefoxDriver();// we can use googlechrome also.
		driver.get(Fb.url);
		driver.findElement(By.name(Fb.nuid)).sendKeys("vktvenkta33@gmail.com");
		driver.findElement(By.name(Fb.npwd)).sendKeys("ashgdhffs");
		driver.findElement(By.id(Fb.isignin)).click();
		String str  = driver.findElement( By.xpath(Fb.xerr)).getText();
		System.out.println(str);
		
		
	}

}
