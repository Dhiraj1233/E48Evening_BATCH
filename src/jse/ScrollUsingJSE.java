package jse;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import util.WebdriverUtility;

public class ScrollUsingJSE extends WebdriverUtility
{
	public static void main(String[] args) throws InterruptedException {
		WebdriverUtility.launchBrowser("https://demoapps.qspiders.com/ui");
		Thread.sleep(2000);
//		WebElement ele = driver.findElement(By.xpath("(//a[text()='Zomato'])[2]"));
		WebElement dis = driver.findElement(By.xpath("//li[text()='Disabled']"));
		
		WebElement usn = driver.findElement(By.id("name"));
		
		
		//hidden elements
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()",dis );
		jse.executeScript("arguments[0].value='jhdkwd'",usn);
		
		
		
//		jse.executeScript("arguments[0].scrollIntoView(true)",ele);
		
		//top to bottom
//		jse.executeScript("window.scrollBy(0,1000)");
//		Thread.sleep(1000);
//		for (int i = 0; i < 4; i++) 
//		{
//			
//			// bottom to top
//			jse.executeScript("window.scrollBy(0,-200)");
//			Thread.sleep(1000);
//		}
//		
		
		
		
		
		
		
		
		
		
//		jse.executeScript("window.scrollTo(0,500)");
		
	}

}
