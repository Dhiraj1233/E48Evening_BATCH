package dataProvider;

import org.testng.annotations.Test;

public class DataProviderUtilityData 
{
	@Test(dataProvider = "LoginData",
			dataProviderClass = DataProviderUtil.class)
	public void loginData(String usn,String psw) {
		System.out.println(usn+""+psw);
		
	}

}
