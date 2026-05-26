package popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ChildPopup 
{
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ele = driver.findElement(By.xpath("(//button[text()='view more'])[2]"));
		ele.click();
		String parentsBrowser = driver.getWindowHandle();// it will fetch only parent browser or tab address...
		Set<String> wins = driver.getWindowHandles();// it will fetch parent and child browser address both...
		//count the browser
		System.out.println(wins.size());
		//switch to child browser and close the child browser

		//wins=> both the address
//		wins.remove(parentsBrowser);
		for(String win:wins)
		{
			driver.switchTo().window(win);
			System.out.println(driver.getTitle());
			if(!parentsBrowser.equals(win))
			driver.close();

		}}}
