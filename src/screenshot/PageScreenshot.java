package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class PageScreenshot 
{
	// 2. Entire page screenshot-> downcasting from webdriver to takesscreenshot
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();//upcasting
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		//downcasting
		TakesScreenshot ts =(TakesScreenshot)driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File perm = new File("./screenshot/PageSC.png");
		FileHandler.copy(temp, perm);
		
		driver.quit();
		
		
		
		
	}

}
