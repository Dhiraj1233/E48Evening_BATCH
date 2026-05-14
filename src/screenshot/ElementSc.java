package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import _3rdDay.WebdriverManageMethod;

public class ElementSc 
{
	// 1. Element screenshot-> Webelement method
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//button[text()='Register']"));
		File temp = ele.getScreenshotAs(OutputType.FILE);
		File perm = new File("./screenshot/register.png");
		FileHandler.copy(temp, perm);
		
		
		
		
		
		
		
	}
	
	

}
