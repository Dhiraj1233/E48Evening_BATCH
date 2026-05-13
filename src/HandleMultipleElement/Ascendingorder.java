package HandleMultipleElement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ascendingorder 
{
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		ArrayList<String> arr=new ArrayList<String>();
		for(WebElement link:links) 
		{
		   	String txt = link.getText();
			arr.add(txt);	
		}
		Collections.sort(arr);
		for(String ar:arr) 
		{
			System.out.println(ar);
		}
	}
}
// check the all checkboxes in ascending order and deselect in descending order
