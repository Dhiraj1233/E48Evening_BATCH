package dataProvider;

import org.testng.annotations.DataProvider;

public class DataProviderUtlity 
{
	@DataProvider(name =  "RegisterAcc_Test_Data")
	public Object[][] data() {
		return new Object[][] 
				{
			{"Admin","Admin123@gmail.com","Sendkeys"},
			{"Admin1","Admin1234@gmail.com","Sendkeys1"},  
			{"Admin2","Admin12345@gmail.com","Sendkeys2"},
			{"Admin3","Admin123456@sgmail.com","Sendkeys3"},  
				};
	}
}
