package relativeLocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class ExampleRelative
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);
		// toLeftOf()
		driver.findElement(RelativeLocator.with(By.xpath("//span[text()='Downloads']"))
				.toLeftOf(By.xpath("//span[text()='Documentation']"))
				).click();
		
		// toRightOf()
		driver.findElement(RelativeLocator.with(By.xpath("//span[text()='Documentation']"))
				.toRightOf(By.xpath("//span[text()='Downloads']"))).click();
		
		
	}

}
