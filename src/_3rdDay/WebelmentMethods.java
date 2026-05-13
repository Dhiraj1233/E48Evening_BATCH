package _3rdDay;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebelmentMethods 
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/checkbox/disabled?sublist=2");
		Thread.sleep(2000);
		WebElement checkBox = driver.findElement(By.name("Domain"));
		boolean enabled = checkBox.isEnabled();
		System.out.println(enabled);
		
		
		
//		checkBox.click();
//		boolean select = checkBox.isSelected();
//		System.out.println(select);
		
		
		
		
		
//		WebElement usn = driver.findElement(By.id("name"));
//		boolean disp = usn.isDisplayed();
//		System.out.println(disp);
		
		
//		if(usn.isDisplayed())
//		{
//			usn.sendKeys("Admin");
//		}
//		
	
		
		
		
		
		
		
//		Point loc = usn.getLocation();
//		System.out.println("X axis of an element=> "+loc.getX());
//		System.out.println("Y axis of an element=> "+loc.getY());
		
		
		
		
		
		
		
		
//		Dimension size = usn.getSize();
//		System.out.println("Heigth of an element "+size.getHeight());
//		System.out.println("Width of an element "+size.getWidth());
		
		
		
		
		
		
		
		
//		Thread.sleep(2000);
//		WebElement regBtn = driver.findElement(By.xpath("//button[@type='submit']"));
//		System.out.println(regBtn.getTagName());
		
		
		
		
//		System.out.println(regBtn.getCssValue("background-color"));
		
		
		
		
//		System.out.println(regBtn.getAttribute("type"));
		
		
//		driver.quit();
//		disabled:cursor-not-allowed focus:outline-none disabled:opacity-30 bg-orange-500 hover:bg-orange-700 text-white font-bold py-2 px-4 rounded focus:shadow-outline
//		disabled:cursor-not-allowed focus:outline-none disabled:opacity-30 bg-orange-500 hover:bg-orange-700 text-white font-bold py-2 px-4 rounded focus:shadow-outline
		
		
		
		
//		Thread.sleep(2000);
//		WebElement ele  = driver.findElement(By.id("name"));
//		ele.sendKeys("Dhiraj");
//		Thread.sleep(2000);
//		WebElement regsiterBtn = driver.findElement(By.xpath("//button[@type='submit']"));
//		regsiterBtn.submit();
//		String text = regsiterBtn.getText();
//		System.out.println(text);
		
	}

}
