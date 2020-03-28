import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class write_data_into_excel {

	
	
	
	
	public static void main(String[] args) throws Exception {
	
		
		
		
		FileInputStream fin = new FileInputStream("d:\\insert_data_into_excel.xlsx");   //get the file
		XSSFWorkbook wb= new XSSFWorkbook(fin);// workbook in  the file
		XSSFSheet ws= wb.getSheet("Sheet1");  //get sheet in the workbook	
		
		Row row=ws.createRow(0);  //create row in the sheet // creating row 1
		row.createCell(0).setCellValue("venkat");// inserting  values into excel ,1 row cell 1
		row.createCell(1).setCellValue("Rahul");                               // 1 row ,cell 2
		row.createCell(2).setCellValue("prabhu");                              // 1 row ,cell 3
		
		
		
		 // creating row 2
		row=ws.createRow(1);
		row.createCell(0).setCellValue("100"); 
		row.createCell(1).setCellValue("200");
		row.createCell(2).setCellValue("300");
		
		
		// creating row 3
		
		row=ws.createRow(2);
		row.createCell(0).setCellValue("500"); 
		row.createCell(1).setCellValue("600");
		row.createCell(2).setCellValue("700");
		
		
		
		FileOutputStream fout = new FileOutputStream("d:\\insert_data_into_excel.xlsx"); //write data into workbook   this will save
		wb.write(fout);
		
		fin.close();
		fout.close();
		
		
		

	}

}
