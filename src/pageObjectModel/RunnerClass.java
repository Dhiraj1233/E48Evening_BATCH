package pageObjectModel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RunnerClass 
{
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com");
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void loginFacebook() {
		FacebookLoginPom fb=new FacebookLoginPom(driver);
		fb.loginAction("Admin","Dhiraj");
//		fb.enterUsn().sendKeys("Admin");
//		fb.enterPass().sendKeys("1234");;
//		fb.clickLgBtn();
//		
//		driver.navigate().refresh();
//		fb.enterUsn().sendKeys("Dhiraj");
//		fb.enterPass().sendKeys("kr");
//		fb.clickLgBtn();
	}

}
