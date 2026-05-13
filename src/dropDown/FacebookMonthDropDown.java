package dropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class FacebookMonthDropDown 
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
//		driver=new EdgeDriver();
//		new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/reg/?entry_point=login&next=");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='_r_9_']")).click();
		Thread.sleep(2000);
		List<WebElement> dropdowns = 
		driver.findElements(By.xpath("//div[@id='_r_8_']//div[@tabindex='-1']/div/div/div/div/div/div"));
		for(WebElement dd:dropdowns) 
		{
			if (dd.getText().contains("Feb")) 
			{
				dd.click();
				break;	
			}
			
		}
		
	}

}




