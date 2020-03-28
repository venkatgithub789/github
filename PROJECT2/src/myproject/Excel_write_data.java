package myproject;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_write_data {

	public static void main(String[] args) throws Exception {
		
		
		FileInputStream fin = new FileInputStream("d:\\data1.xlsx");   //get the file
		XSSFWorkbook wb= new XSSFWorkbook(fin);// workbook in  the file
		XSSFSheet ws= wb.getSheet("Sheet4");  //get sheet in the workbook
		
		Row row=ws.createRow(0);  //create row in the sheet // creating row 1
		row.createCell(0).setCellValue("selenium");// inserting all values in sheet3 of excel 
		row.createCell(1).setCellValue("java");
		row.createCell(2).setCellValue("testing");
		
		row=ws.createRow(1);  //create row in the sheet  // creating row 2
		row.createCell(0).setCellValue("100");
		row.createCell(1).setCellValue("200");
		row.createCell(2).setCellValue("300");
		
		row=ws.createRow(2);  //create row in the sheet  // creating row 3
		row.createCell(0).setCellValue("400");
		row.createCell(1).setCellValue("500");
		row.createCell(2).setCellValue("600");
		
		
		
		
		
		FileOutputStream fout = new FileOutputStream("d:\\data1.xlsx"); //write data into workbook   this will save
		wb.write(fout);
		
		fin.close();
		fout.close();
		
		
		
		

	}

}
