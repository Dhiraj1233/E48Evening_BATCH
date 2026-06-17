package grouping;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass 
{
	WebDriver driver;
	@BeforeMethod(alwaysRun = true)
	public void setUp() {
		driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com");
	}

	@AfterMethod(alwaysRun = true)
	public void tearDown() {
		driver.close();

	}

}
