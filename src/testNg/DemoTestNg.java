package testNg;

import static org.testng.Assert.fail;

import org.testng.annotations.Test;

public class DemoTestNg 
{
	@Test(priority = 1)
	public void smoke() 
	{
		System.out.println("---This is smoke Tc -->getting executed by TestNG---");
		fail();
	}
	@Test(priority = 2,dependsOnMethods = "smoke")
	public void sanity() 
	{
		System.out.println("---This is sanity Tc -->getting executed by TestNG---");
	}
	@Test(priority = 3,dependsOnMethods = "sanity")
	public void regression() 
	{
		System.out.println("---This is  regression -->getting executed by TestNG---");
	}
	@Test(priority = 4,dependsOnMethods = "regression")
	public void ddt() 
	{
		System.out.println("---This is ddt Tc -->getting executed by TestNG---");
	}
}
