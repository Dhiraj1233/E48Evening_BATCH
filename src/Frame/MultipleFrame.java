package Frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class MultipleFrame
{
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapps.qspiders.com/ui/frames/multiple?sublist=2");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement frame1 = driver.findElement(By.xpath("(//iframe)[1]"));//frame 1
	driver.switchTo().frame(frame1);
	driver.findElement(By.id("email")).sendKeys("Admin");
	driver.switchTo().defaultContent();// main page
	WebElement frame2 = driver.findElement(By.xpath("(//iframe)[2]"));// frame 2
	driver.switchTo().frame(frame2);// switch to the frame 2
	driver.findElement(By.id("username")).sendKeys("Dhiraj");
	Thread.sleep(2000);
	driver.quit();
	}
}
