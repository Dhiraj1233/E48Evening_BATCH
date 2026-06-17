package dataProvider;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviderUtil
{
//Fetching the data from excel
	
	@DataProvider(name = "LoginData")
	public String[][] getData() throws IOException
	{ 
		String path="./Excel/TestDataE48.xlsx";//taking xl file from testdata
		ExcelUtility xl = new ExcelUtility(path);//creating an object for ExcelUtility
		int totalRows = xl.getRowCount(path, "Sheet1");//row count
		int totalCols = xl.getCellCount(path, "Sheet1", 1);//cols count
		String loginData[][]=new String[totalRows+1][totalCols];//2d String array
		for(int r = 1; r<=totalRows;r++) {
			
			for(int c=0; c<totalCols;c++) {
				
				loginData[r][c]=xl.fetchCellData(path, "Sheet1", r, c);
			}
		}
		return loginData;		
	}

}
