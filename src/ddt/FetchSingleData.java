package ddt;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FetchSingleData 
{
	public static void main(String[] args) throws IOException {
		// how to read the data from excel sheet
		//		-> create excel sheet and save it in .xlsx 
		
		
		//step:1 create object of fileinputstream class
		FileInputStream fis=new FileInputStream("./Excel/TestDataE48.xlsx");
		
		//step:2 open the excel in read mode
		XSSFWorkbook book = new XSSFWorkbook(fis);
		
		//step:3 take the control of sheet
		XSSFSheet sheet = book.getSheet("Sheet1");
		
		//step:4 take the control of row
		XSSFRow row = sheet.getRow(1);
		
		//step:5 get the control of cell
		XSSFCell cell = row.getCell(0);
		
		//step:6 Read the Data
		System.out.println(cell.getStringCellValue());
		
		//step:7 close the workbook
		book.close();
		



	}

}
