package Frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrame
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/frames?sublist=0");//mainpage
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement frame = driver.findElement(By.xpath("//iframe"));//frame
		driver.switchTo().frame(frame);//switch the control from main page to the frame
		driver.findElement(By.id("username")).sendKeys("Admin");
//		driver.switchTo().defaultContent();//it will go back to main page from any of the frame
		driver.switchTo().parentFrame();// it will go back from inner frame to the outer frame
		WebElement nest = driver.findElement(By.xpath("//a[text()='Nested iframe']"));
		nest.click();
		Thread.sleep(2000);
		driver.quit();
	}

}
