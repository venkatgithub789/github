import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Excel_read_data2 {

	
	
	
	
	public static void main(String[] args) throws Exception 
	
	{
		
		
		FileInputStream fn = new FileInputStream("D:\\VENKATADRI SIR  SELENIUM\\20jan2020\\data1.xlsx");//get the file from our local computer
    	XSSFWorkbook wb = new XSSFWorkbook(fn); // work book in the file
		XSSFSheet ws = wb.getSheet("sheet1"); // get sheet in the workbook
		
        Row row;
		
		for(int r=0;r<=ws.getLastRowNum();r++)   // for all the rows used in the sheet
		{
			row=ws.getRow(r);
			for(int c=0;c<row.getLastCellNum();c++)   // for all the cells in the row
			{
				System.out.println(row.getCell(c).getStringCellValue());
			}
		}
		                     
				
				fn.close();
		
		

	}

}
