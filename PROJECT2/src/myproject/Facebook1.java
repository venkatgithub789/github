package myproject;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;



public class Facebook1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		
		
        ChromeDriver drvobj = new ChromeDriver();
		
        drvobj.get("https://www.facebook.com");
        drvobj.findElement(By.name("email")).sendKeys("vktvenkat33@gmail.com");
        drvobj.findElement(By.name("pass")).sendKeys("sasdfheesjf");// entering wrong password here
        drvobj.findElement(By.id("loginbutton")).click();
         
               String str = drvobj.findElement(By.xpath("//div[@class='_4rbf _53ij']")).getText();
               
                 //collecting the text msg which we get after wrong pwd is entered
                
               drvobj.manage().window().maximize();// code used to maximize the window .
               
               
              Thread.sleep(8000);//  here we can clearly see this is a java code.and shows that thread class is from java.lan package
               
              // if any selenium code is required ,it clearly imports ---its concerned class ---at the top of the class definition.     
               
                System.out.print(str);
                
                drvobj.close();
        	
		
		
		
		

	}

}
