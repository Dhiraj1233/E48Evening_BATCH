package ddt;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WriteMultipleData 
{
	// we should have the multiple data->  flipkart-> links
	
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com");
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		FileInputStream fis = new FileInputStream("./Excel/TestDataE48.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(fis);
		XSSFSheet sheet = book.createSheet("Zomato_Links&Texts");
		
		for(int i =0;i<links.size();i++) {
			WebElement link = links.get(i);
			String url = link.getAttribute("href");// fetch all the links
			String text=link.getText();//fetch all the text of links
			XSSFRow row = sheet.createRow(i);//create row based on links
			XSSFCell cell = row.createCell(0);//create cell on zeroth index-> text
			XSSFCell cell1 =row.createCell(1);//create cell on 1st index-> url
			cell.setCellValue(text);
			cell1.setCellValue(url);
		}
		
		FileOutputStream fos = new FileOutputStream("./Excel/TestDataE48.xlsx");
		book.write(fos);
		book.close();
		fis.close();
		fos.close();
		driver.quit();
		
		
	}
	

}
