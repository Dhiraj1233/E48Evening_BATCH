package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import _3rdDay.WebdriverManageMethod;

public class Hidden_Popup 
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//div[@role='combobox']")).click();
		
		Actions act = new Actions(driver);
		act.scrollToElement(driver.findElement(By.xpath("(//button[@role=\"link\"])[1]"))).perform();
		
		for(;;) {
			try {
			 driver.findElement(By.xpath("//span[text()='15']")).click();
				break;
			}
			catch (Exception e) {
				Thread.sleep(1000);
				driver.findElement(By.xpath("//div[@class='mainDatesWrap___feda92']/div/i[2]")).click();
			}	
		}
	}

}
