package grouping;

import org.testng.annotations.Test;

public class Group extends BaseClass
{
	@Test(groups = "Smoke")
	public void smoke() {
		System.out.println(driver.getCurrentUrl());
	}
	@Test(groups = "Smoke")
	public void smoke1() {
		System.out.println(driver.getPageSource());
	}
	@Test(groups = "Sanity")
	public void sanity() {
		System.out.println(driver.getTitle());
	}
	@Test(groups = "Regression")
	public void regression() {
		System.out.println("Regression TC executed");
	}
	@Test(groups = "Data_Driven")
	public void dataDriven() {
		System.out.println("Data_Driven TC Executed");
	}

}
