package ddt;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadTheMultipleData {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./Excel/TestDataE48.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(fis);
		XSSFSheet sheet = book.getSheet("Zomato_Links&Texts");
		int count = sheet.getLastRowNum();
		for(int i=0;i<count;i++) {
			
			XSSFRow row = sheet.getRow(i);
			XSSFCell cell = row.getCell(1);
			String value = cell.getStringCellValue();
			System.out.println(value);	
		}
		book.close();
		fis.close();
	}
}
