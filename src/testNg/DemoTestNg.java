package testNg;

import org.testng.annotations.Test;

public class DemoTestNg 
{
	@Test(priority = 0)
	public void smoke() 
	{
		System.out.println("---This is smoke Tc -->getting executed by TestNG---");
	}
	@Test(priority = 1)
	public void sanity() 
	{
		System.out.println("---This is sanity Tc -->getting executed by TestNG---");
	}
	@Test(priority = 2)
	public void ddt() 
	{
		System.out.println("---This is ddt Tc -->getting executed by TestNG---");
	}
}
