package ddt;

import java.io.IOException;

import dataProvider.ExcelUtility;

public class ReadDataUsingUtiltiy
{
	static String path="./Excel/Excel_Utility.xlsx";
	public static void main(String[] args) throws IOException {

		// fetch the data
//		ExcelUtility xl = new ExcelUtility(path);
//		String data = xl.fetchCellData(path, "Sheet1", 1, 0);
//		System.out.println(data);

		
		// Write the data
		ExcelUtility xl = new ExcelUtility(path);
		xl.setCellData(path, "UtilityData", 0, 0, "Dhiraj");
	}
}
