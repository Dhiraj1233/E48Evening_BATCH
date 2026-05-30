package ddt;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteSingleData {
	public static void main(String[] args) throws IOException {
		
		//path of the file
		FileInputStream fis = new FileInputStream("./Excel/TestDataE48.xlsx");
		//access the workbook
		XSSFWorkbook book = new XSSFWorkbook(fis);
		//create one sheet
		XSSFSheet sheet = book.createSheet("Dhiraj_Data");
		//create row inside sheet
		XSSFRow row = sheet.createRow(0);
		//create cell
		XSSFCell cell = row.createCell(0);
		//insert the data indside the cell
		cell.setCellValue("Automation Trainer");
		
		// logging the value
		FileOutputStream fos = new FileOutputStream("./Excel/TestDataE48.xlsx");
		// write the value
		book.write(fos);
		//close the workbook
		book.close();
		fis.close();
		fos.close();	
	}

}
