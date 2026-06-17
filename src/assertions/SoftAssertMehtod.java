package assertions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class SoftAssertMehtod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		String ExpectedRes="Demoapps";
		String ActualResult=driver.getTitle();
		SoftAssert sf = new SoftAssert();
		sf.assertEquals(ExpectedRes, ActualResult);//fail
		System.out.println("Completed");
		driver.quit();
		sf.assertAll();// it is used to throw exception
	}
}
