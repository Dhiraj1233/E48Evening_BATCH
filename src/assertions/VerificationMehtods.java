package assertions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerificationMehtods 
{
	public static void main(String[] args) {

		try {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://demoapps.qspiders.com/ui?scenario=1");
			WebElement usn = driver.findElement(By.id("name"));
			assertTrue(usn.isDisplayed());
//	     	assertFalse(usn.isDisplayed());
			System.out.println("Element is displayed");
			System.out.println("End of the program");
			driver.quit();
		}
		catch (Exception e)
		{
			fail();
		}







		//		System.out.println("Element is not displayed");



		//		String ExpectedRes="Demoapps | Qspider";
		//		String ActualResult=driver.getTitle();
		//		assertNotEquals(ExpectedRes, ActualResult);

		//		assertEquals(ExpectedRes, ActualResult);



	}

}
