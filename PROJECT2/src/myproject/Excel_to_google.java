package myproject;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;



// this program reads the data of the  first column cell wise data and insert result into second column  cell wise
// this program is meant for reading data from Excel to Google website and the result on the website we collect and store in second column of excel


public class Excel_to_google {

		
	
	public static void main(String[] args) throws Exception {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		
		FileInputStream fin = new FileInputStream("d:\\data1.xlsx");   //get the file //reading file
		XSSFWorkbook wb= new XSSFWorkbook(fin);// workbook in  the file
		XSSFSheet ws= wb.getSheet("Sheet2");  //get sheet in the workbook
		
		Row row;
		  
		     //  for(int r=1;r<=wb.getSheet("sheet2").getLastRowNum();r++)
		     for(int r=1;r<=ws.getLastRowNum();r++)   // for all the rows used in the sheet//
		{
			row=ws.getRow(r);
			driver.findElement(By.name("q")).sendKeys(row.getCell(0).getStringCellValue());
			driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
			Thread.sleep(3000);
			row.createCell(1).setCellValue(driver.findElement(By.id("resultStats")).getText());
			driver.navigate().back();
			Thread.sleep(1000);
		}
		
		FileOutputStream fout = new FileOutputStream("d:\\data1.xlsx"); //write data into workbook   this will save
		wb.write(fout);
		
		fin.close();
		fout.close();
		
		
	

	}

}

