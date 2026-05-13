package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TagNameLocator 
{
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//driver => browser address
		WebElement loginBtn = driver.findElement(By.cssSelector("input[name='email']"))	;
		loginBtn.sendKeys("Admin");
		
		

		
		
		
		
		
		
		
		
		
		
		//Dummy pages

//		WebElement ele = driver.findElement(By.name("r2"));
//		ele.click();
		
		
//		WebElement ele = driver.findElement(By.id("i1"));
//		ele.sendKeys("Admin");
		
		
//		WebElement ele=driver.findElement(By.tagName("input"));
//		ele.sendKeys("Dhiraj");
		
		
	}

}
