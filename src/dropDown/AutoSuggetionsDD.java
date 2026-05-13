package dropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AutoSuggetionsDD 
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Selenium Web");
		Thread.sleep(2000);
		List<WebElement> dds = driver.findElements(By.xpath("(//ul[@jsname='bw4e9b'])[1]/li"));
		for (WebElement dd : dds)
		{
			if(dd.getText().contains("webdriver"))
				dd.click();
			break;
		}
		
	}

}
