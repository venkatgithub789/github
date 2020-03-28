

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Excel_to_yahoo2 {

	
	public static void main(String[] args) throws Exception 
	
	{
		
		//fileinputstream fn = new fileinputstream("d:\\VENKATADRI SIR  SELENIUM\\21JAN2020_TESTNG\data1.xlsx");
		 
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		
		FileInputStream fn = new FileInputStream("d:\\VENKATADRI SIR  SELENIUM\\21JAN2020_TESTNG\\data1.xlsx");//get the file from our local computer
		XSSFWorkbook wb = new XSSFWorkbook(fn); // work book in the file
		XSSFSheet ws = wb.getSheet("sheet3"); // get sheet in the workbook
		
        Row row;
	    Cell cell1 ;
		for(int r=1;r<=ws.getLastRowNum();r++)   // for all the rows used in the sheet
		
		{
			row=ws.getRow(r);
			
		driver.get("https://login.yahoo.com/?.src=ym&.lang=en-IN&.intl=in&.done=https%3A%2F%2Fin.mail.yahoo.com%2Fd");
		driver.findElement(By.name("username")).sendKeys(row.getCell(0).getStringCellValue());
		driver.findElement(By.name("signin")).click();
		Thread.sleep(4000);
		
		
		cell1 = row.getCell(1,MissingCellPolicy.RETURN_BLANK_AS_NULL);
		 if(cell1==null)
		 {
	    driver.findElement(By.name("password")).sendKeys("");
		 }
		 
		 else
		 {
		driver.findElement(By.name("password")).sendKeys(row.getCell(1).getStringCellValue());
		 }
		 
		driver.findElement(By.name("verifyPassword")).click();
		Thread.sleep(4000);
		
		
		try
		
		{
			
		  if (driver.findElement(By.linkText("Sign out")).isDisplayed())	
		
			      {
			
			  row.createCell(2).setCellValue("Login is Sucess");
			  driver.findElement(By.linkText("Sign out")).click();
				
			      }		
				
		}
		
		catch(Exception e)
		
		   {
			row.createCell(2).setCellValue(driver.findElement(By.xpath("//p[@class='error-msg']")).getText());
			
		   }
							
        
		}
		
		driver.close();
		
		
		FileOutputStream fout = new FileOutputStream("d:\\VENKATADRI SIR  SELENIUM\\21JAN2020_TESTNG\\data1.xlsx"); //write data into workbook   this will save
		wb.write(fout);// In Excel(data1), sheet3 ,the third column  with heading as "STATUS" will be filled with respective outputs, 
		                                                                                             //for each  username & password
		
		fn.close();
		fout.close();
		
		
	}

}
