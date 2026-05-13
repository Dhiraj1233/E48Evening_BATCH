package HandleMultipleElement;

import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchAllFlipkartLinks 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		for (WebElement link : links) 
		{
			
			//url of all the links
			String url = link.getAttribute("href");
			System.out.println(url);
			
			
		
			//fetch the all text of the links
			String text = link.getText();
			System.out.println(text);
			
		}
		
		
		
		
		
//		System.out.println(links);
		
//		<a href ="url" >facebook</a>
		
	}

}
