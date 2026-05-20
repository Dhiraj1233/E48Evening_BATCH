package jse;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll 
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/");
		
		//downcasting from webdriver to JavascriptExecutor interface
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("(//a[text()='Zomato'])[2]"));
		Point location=ele.getLocation();
		int y=location.getY();
		int x=location.getX();
//		jse.executeScript("window.scrollBy("+x+","+y+")");
		jse.executeScript("window.scrollBy(x,y)");// not possible
		
		// example of concatenation
		System.out.println("--> This is "+x+" value");
		System.out.println(y+"--> This is y value");
	}
}
