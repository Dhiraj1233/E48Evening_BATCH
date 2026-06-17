package dataProvider;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataPro 
{
	@Test(dataProvider = "RegisterAcc_Test_Data",dataProviderClass = DataProviderUtlity.class)
	public void registerAcc(String name,String email,String psw) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.findElement(By.id("name")).sendKeys(name);
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("password")).sendKeys(psw);
		driver.findElement(By.xpath("//button[text()='Register']")).click();
	}

	
}
