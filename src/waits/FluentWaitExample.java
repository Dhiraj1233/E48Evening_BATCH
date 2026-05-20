package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import _3rdDay.WebdriverManageMethod;

public class FluentWaitExample
{
	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.get("https://www.facebook.com/");
		 driver.findElement(By.name("email")).sendKeys("Admin");
		 driver.findElement(By.name("pass")).sendKeys("Admin@123");
		 WebElement loginBtn = driver.findElement(By.xpath("//span[text()='Log in']"));
		 
		//Fluent wait
		 FluentWait wait = new FluentWait(driver);
		 wait.withTimeout(Duration.ofSeconds(30));
		 wait.pollingEvery(Duration.ofSeconds(1));
		 wait.until(ExpectedConditions.elementToBeClickable(loginBtn));
		 
		 loginBtn.click();
	}

}
