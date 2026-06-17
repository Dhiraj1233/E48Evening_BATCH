package testNg;

import org.testng.annotations.Test;

public class FetchUrl extends BaseTest
{
	@Test
	public void fetchUrl() {
		System.out.println("This is the currentUrl --> "+driver.getCurrentUrl());
	}

}
