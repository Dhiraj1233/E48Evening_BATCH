package mouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();//upcasting
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// 3rd line of code
		driver.get("https://demoapps.qspiders.com/ui/mouseHover?sublist=0");
		WebElement ele = driver.findElement(By.xpath("//h1[text()='Password : ']/following-sibling::div/img[2]"));
		
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
		
		
		
		
		
		
		
		
		
		
		
		
		// in the broswer manage the wait using implicit way
//		WebElement ele = driver.findElement(By.xpath("//h1[text()='Password : ']/following-sibling::div/img[2]"));
//		Actions act = new Actions(driver);
//		act.moveToElement(ele).perform();
//		act.contextClick(ele).perform();	
		
		
	}

}
