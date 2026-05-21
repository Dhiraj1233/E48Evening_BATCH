package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPoppp
{
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opts = new ChromeOptions();
//		opts.addArguments("--disable-notifications ");
		opts.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(opts);
		driver.get("https://demoapps.qspiders.com/ui/browserNot?sublist=0");
		Thread.sleep(2000);
		driver.findElement(By.id("browNotButton")).click();
		
	}

}
