package HandleMultipleElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllElementInReverse 
{
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		for(int i=links.size()-1; i>=0;i--) 
		{
			WebElement link = links.get(i);
			System.out.println(link.getText());
		}
		driver.quit();
	}
	
	
	// normal order.... b c a d t 
	// reverse order....t d a c b
	
	// ascending order... abcd
	// descending order...dcba
	
	

}
