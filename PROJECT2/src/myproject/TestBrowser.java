package myproject;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestBrowser {

	public static void main(String[] args) {

		//CTRL + SHIFT + O
		//Whats App
		System.setProperty("webdriver.chrome.driver", "C:/eclip_zip/eclipse/PROJECT2/chromedriver.exe");
		//ChromeDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		
		driver.close(); // current browser
		//driver.quit();

	}

}
