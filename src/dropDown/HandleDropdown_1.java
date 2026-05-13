package dropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class HandleDropdown_1 
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
		Thread.sleep(2000);
		WebElement multi= driver.findElement(By.id("select3"));
		//select class constructor will ask for one argument that is address of the dropdown
		Select s = new Select(multi);

		// check whether it is multi select dropdown or not
		System.out.println(s.isMultiple());

		// Select the options 
		s.selectByContainsVisibleText("Fjallraven");
		s.selectByIndex(1);
		s.selectByValue("Mens Cotton Jacket");
		s.selectByVisibleText("Mens Casual Slim Fit...");

		// Get all selected options from dropdown
		List<WebElement> allSOpts = s.getAllSelectedOptions();
		for (WebElement allOpt : allSOpts) {
			System.out.println(allOpt.getText());
		}

		// fetch the option which is selected at the top
		WebElement firstopt = s.getFirstSelectedOption();
		System.out.println(firstopt.getText());

		// deselect methods
		String value="Mens Cotton Jacket";
		s.deselectAll();
		s.deselectByVisibleText("Mens Casual Slim Fit...");
		s.deSelectByContainsVisibleText("Fjallraven");
		s.deselectByIndex(1);
		s.deselectByValue(value);

		//all option from dropdown 
		List<WebElement> opts = s.getOptions();
		System.out.println(opts.size());
		for (WebElement opt : opts) {
			System.out.println(opt.getText());
		}

	}
}
