package jse;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import util.WebdriverUtility;

public class DisabledTc extends WebdriverUtility
{
	public static void main(String[] args) throws InterruptedException {
		WebdriverUtility.launchBrowser("https://testing.qaautomationlabs.com/checkbox.php");
//		driver.findElement(By.id("btn_abc")).click();
		WebElement disbaledCheckbox = driver.findElement(By.id("chk4"));
		
		
		JavascriptExecutor jse =(JavascriptExecutor)driver;
		Thread.sleep(2000);
		jse.executeScript("arguments[0].click();",disbaledCheckbox);
		
		
	
	}

}
