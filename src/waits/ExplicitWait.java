package waits;

import java.time.Duration;

import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ExplicitWait
{
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		//condition
		WebDriverWait ew = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement ele = ew.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("email"))));
		if(ele.isDisplayed()) {
			ele.sendKeys("Dhiraj");
		}
//		Boolean ele = ew.until(ExpectedConditions.urlContains("Facebook"));
//
//		if(ele)//false
//		{
//			driver.findElement(By.name("email")).sendKeys("Admin");
//		}
	}
}