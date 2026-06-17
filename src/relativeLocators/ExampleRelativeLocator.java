package relativeLocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class ExampleRelativeLocator 
{
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// above() and below()
		driver.findElement(RelativeLocator.with(By.name("email"))
				.above(By.name("pass"))).sendKeys("Admin");
		driver.findElement(RelativeLocator.with(By.name("pass"))
				.below(By.name("email"))).sendKeys("Dhiraj@123");
		driver.findElement(RelativeLocator.with(By.xpath("//span[text()='Log in']"))
				.below(By.name("pass"))).click();
		
		
		
	}

}
