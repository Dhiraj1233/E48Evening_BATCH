package testNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoQspTc 
{
	@Test
	public void registerAcc() 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.findElement(By.id("name")).sendKeys("Dhiraj");
		driver.findElement(By.id("email")).sendKeys("dhirajkr1997@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Dhiraj@134");
		driver.findElement(By.xpath("//button[text()='Register']")).click();
	}
}