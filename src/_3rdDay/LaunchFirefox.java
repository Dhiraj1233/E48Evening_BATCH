package _3rdDay;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchFirefox
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
//		driver.manage().window().maximize();
//		driver.manage().window().fullscreen();
//		driver.manage().window().minimize();	
//		String src = driver.getPageSource();
//		String url = driver.getCurrentUrl();
//		String title = driver.getTitle();
//		System.out.println(src);
//		Thread.sleep(2000);
//		driver.quit();
		
	}

}
