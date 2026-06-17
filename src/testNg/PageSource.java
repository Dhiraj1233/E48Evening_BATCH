package testNg;
import org.testng.annotations.Test;


public class PageSource extends BaseTest
{
	@Test
	public void fetchSc() {
		System.out.println("This is the sourceCode --> "+driver.getPageSource());	
	}
}
