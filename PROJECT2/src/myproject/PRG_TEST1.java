package myproject;

import org.openqa.selenium.firefox.FirefoxDriver;

public class PRG_TEST1 {

	public static void main(String[] args) {
		
		
		//this line is typed when we dont have chromedriver.exe in eclipse.
		System.setProperty("webdriver.chrome.driver", "C:/eclip_zip/eclipse/PROJECT2/chomrdriver.exe ");
		
		
		FirefoxDriver driver = new FirefoxDriver();
		//this line is used when we include chromeddriver.exe in eclipse
		
		driver.get("http://google.com");
		driver.close();// closes current browser
		
		
		
			}

}


/*------------------------------------------------------------------------------------*/
/*import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBrowser {

	public static void main(String[] args) {

		//CTRL + SHIFT + O
		//Whats App
		//System.setProperty("webdriver.chrome.driver", "F:/selenium-prerequisite/chromedriver_win32_11/chromedriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		//driver.close(); // current browser
		driver.quit();

	}

}*/