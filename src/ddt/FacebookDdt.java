package ddt;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import _3rdDay.WebdriverManageMethod;
import dataProvider.ExcelUtility;

public class FacebookDdt 
{
	public static void main(String[] args) throws IOException {
		
		//step: Read the data from excel
		ExcelUtility xl=new ExcelUtility("./Excel/TestDataE48.xlsx");
		FileInputStream fis = new FileInputStream("./Excel/TestDataE48.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(fis);
		XSSFSheet sheet = book.getSheet("Sheet1");
		XSSFRow row = sheet.getRow(1);
		XSSFCell cell = row.getCell(0);
		XSSFCell cell1 = row.getCell(1);
		String usn = cell.getStringCellValue();
		String psw = cell1.getStringCellValue();
		book.close();
		
//			System.out.println(usn +"  "+psw);
		//step: Pass the data in tc
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys(usn);
		driver.findElement(By.name("pass")).sendKeys(psw);
		System.out.println("Done");
		
		
		
		
		
	}

}
