package _3rdDay;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverManageMethod
{
	public static void main(String[] args) throws InterruptedException
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapps.qspiders.com/ui");
	Thread.sleep(2000);
	WebElement ele  = driver.findElement(By.id("name"));
	ele.sendKeys("Dhiraj");
	Thread.sleep(2000);
	ele.clear();
	
	
	
	// webdriver => 11  methods will perfrom actions on the browser
	// webelement => 
	
	
	
	
	
	
	
//	//to set the window size
//	Dimension d = new Dimension(600, 400);
//	driver.manage().window().setSize(d);
//	Thread.sleep(2000);
//	
//	Point position = driver.manage().window().getPosition();
//	System.out.println(position);
//	
//	
//	Point p = new Point(200, 200);
//	driver.manage().window().setPosition(p);
//	
//	
//	
	
	
	
	
	//to fetch the window size
//	Dimension size = driver.manage().window().getSize();
//	System.out.println(size);
		
	}

}
