package P2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


import PK1.fb_interface;

public class facebook_login_using_interface {

	public static void main(String[] args) {
		
ChromeDriver drvobj = new ChromeDriver();
		
        drvobj.get(fb_interface.url);
        drvobj.findElement(By.name(fb_interface.nuid)).sendKeys("vktvenkat33@gmail.com");
        drvobj.findElement(By.name(fb_interface.npwd)).sendKeys("sasdfheesjf");// entering wrong password here
        drvobj.findElement(By.id(fb_interface.isignin)).click();
         
               String str = drvobj.findElement(By.xpath(fb_interface.xerror)).getText();
                     
               System.out.print(str);
                
        
		
		
		
		

	}

}
