package pageObjectModel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Why_Pom {
	
	@Test
	public void login() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com");
		WebElement usn = driver.findElement(By.name("email"));
		usn.sendKeys("Admin");
		WebElement psw = driver.findElement(By.name("pass"));
		psw.sendKeys("Admin@123");
		driver.navigate().refresh();
		WebElement usn1 = driver.findElement(By.name("email"));
		usn1.sendKeys("Admin");
		WebElement psw1= driver.findElement(By.name("pass"));
		psw1.sendKeys("Admin@123");		
		
	}

}
