

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google3 
{

	public static void main(String[] args) throws Exception
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		
		FileInputStream fin = new FileInputStream("d:\\data_google3.xlsx");   //get the file
		XSSFWorkbook wb= new XSSFWorkbook(fin);// workbook in  the file
		XSSFSheet ws= wb.getSheet("Sheet2");  //get sheet in the workbook
		
		Row row;
		for(int r=1;r<=ws.getLastRowNum();r++)   // for all the rows used in the sheet
		{
			row=ws.getRow(r);
			driver.findElement(By.name("q")).sendKeys(row.getCell(0).getStringCellValue());
			driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
			Thread.sleep(3000);
			//row.createCell(1).setCellValue(driver.findElement(By.id("resultStats")).getText());
			row.createCell(1).setCellValue(driver.findElement(By.xpath("//div[@id=\"mBMHK\"]")).getText());
			//*[@id="mBMHK"]
			
			driver.navigate().back();
			Thread.sleep(1000);
		}
		
		FileOutputStream fout = new FileOutputStream("d:\\data_google3.xlsx"); //write data into workbook   this will save
		wb.write(fout);
		
		fin.close();
		fout.close();
		
		
	}

}
