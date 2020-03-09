

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_write_data2 {

	public static void main(String[] args) throws Exception {
		
		
		FileInputStream fin = new FileInputStream("D:\\VENKATADRI SIR  SELENIUM\\20jan2020\\data1.xlsx");   //get the file
		XSSFWorkbook wb= new XSSFWorkbook(fin);// workbook in  the file
		XSSFSheet ws= wb.getSheet("Sheet4");  //get sheet in the workbook
		
		Row rowobj=ws.createRow(0);  //create row in the sheet // creating row 1
		rowobj.createCell(0).setCellValue("selenium");// inserting all values in sheet4 of excel 
		rowobj.createCell(1).setCellValue("java");
		rowobj.createCell(2).setCellValue("testing");
		
		rowobj=ws.createRow(1);  //create row in the sheet  // creating row 2
		rowobj.createCell(0).setCellValue("100");
		rowobj.createCell(1).setCellValue("200");
		rowobj.createCell(2).setCellValue("300");
		
		rowobj=ws.createRow(2);  //create row in the sheet  // creating row 3
		rowobj.createCell(0).setCellValue("400");
		rowobj.createCell(1).setCellValue("500");
		rowobj.createCell(2).setCellValue("600");
		
		
		
		FileOutputStream fout = new FileOutputStream("D:\\VENKATADRI SIR  SELENIUM\\20jan2020\\data1.xlsx"); //write data into workbook   this will save
		wb.write(fout);
		
		fin.close();
		fout.close();
		
		

	}

	
}
//-------------------------------------------------------------------------------------------------------------------------------
// ---------data from net----------------------------


//Workbook: XSSFWorkbook and HSSFWorkbook classes implement this interface.
//XSSFWorkbook: Is a class representation of XLSX file.
//HSSFWorkbook: Is a class representation of XLS file.
//Sheet: XSSFSheet and HSSFSheet classes implement this interface.
//XSSFSheet: Is a class representing a sheet in an XLSX file.
//HSSFSheet: Is a class representing a sheet in an XLS file.
//Row: XSSFRow and HSSFRow classes implement this interface.
//XSSFRow: Is a class representing a row in the sheet of XLSX file.
//HSSFRow: Is a class representing a row in the sheet of XLS file.
//Cell: XSSFCell and HSSFCell classes implement this interface.
//XSSFCell: Is a class representing a cell in a row of XLSX file.
//HSSFCell: Is a class representing a cell in a row of XLS file.













