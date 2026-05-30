package ddt;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility 
{
	FileInputStream fis;
	XSSFWorkbook book ;
	XSSFSheet sheet;
	XSSFRow row ;
	XSSFCell cell;
	String ExcelPath=null;

	ExcelUtility(String ExcelPath) {
		this.ExcelPath = ExcelPath;
	}
	//count of the row
	// To count any sheet row call thi method
	public int getRowCount(String ExcelPath,String sheetName) throws IOException {
		fis= new FileInputStream(ExcelPath);
		book= new XSSFWorkbook(fis);
		sheet = book.getSheet(sheetName);
		int rowCount = sheet.getLastRowNum();
		book.close();
		fis.close();	
		return rowCount;
	}
	//count of the cols
	// To get the cell count call this method
	public int getCellCount(String  ExcelPath,String sheetName,int rowNum) throws IOException {

		fis = new FileInputStream( ExcelPath);
		book = new XSSFWorkbook(fis);
		sheet = book.getSheet(sheetName);
		row= sheet.getRow(rowNum);
		int cellCount = row.getLastCellNum();
		book.close();
		fis.close();
		return cellCount;	
	}

	//read the data from 
	// to read the data from excel call this method
	public String fetchCellData(String ExcelPath,String sheetName,int rowNum,int cellNum) throws IOException {
		fis=new FileInputStream(ExcelPath);
		book=new XSSFWorkbook(fis);
		sheet=book.getSheet(sheetName);	
		row=sheet.getRow(rowNum);
		cell=row.getCell(cellNum);
		String data=cell.getStringCellValue();
		book.close();
		fis.close();
		return data;
	}
	//Write the data in excel
	public void setCellData(String ExcelPath,String sheetName,int rowNum,int cellNum,String data) throws IOException {
		fis = new FileInputStream(ExcelPath);
		book=new XSSFWorkbook(fis);
		sheet=book.getSheet(sheetName);
		//if sheet is there means access it or create new one
		if (sheet == null) 
		{
			sheet = book.createSheet(sheetName); 
		}
		row = sheet.getRow(rowNum); 
		if (row == null)
		{ 
			row = sheet.createRow(rowNum);
		} 
		cell = row.getCell(cellNum);
		if (cell == null) 
		{ 
			cell = row.createCell(cellNum); 
		}
		cell.setCellValue(data);
		FileOutputStream fos = new FileOutputStream(ExcelPath);
		book.write(fos);
		book.close();
		fis.close();
		fos.close();
	}


}
