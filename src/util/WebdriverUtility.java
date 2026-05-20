package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverUtility 
{
	public static WebDriver driver;
	public static void launchBrowser(String url) 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
