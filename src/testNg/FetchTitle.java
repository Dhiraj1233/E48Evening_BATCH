package testNg;

import org.testng.annotations.Test;

public class FetchTitle extends BaseTest
{
	@Test
	public void fetchTitle() 
	{	
		System.out.println("This is the title --> "+driver.getTitle());		
	}

}
