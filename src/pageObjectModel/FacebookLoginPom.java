package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLoginPom
{
    // 3 stages 
//	1. Decalaration
	@FindBy(name="email")
	private WebElement usn;
	
	@FindBy(name="pass")
	private WebElement psw;
	
	@FindBy(xpath = "//div[@role=\"button\"]")
	private WebElement loginBtn;
	
//	2. Initalization
	public FacebookLoginPom(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
//	3. Utilization
	
//	public WebElement enterUsn() {
//		return usn;
//	}
//	public WebElement enterPass() {
//		return psw;
//	}
//	public void clickLgBtn() {
//		loginBtn.click();
//	}
	public void loginAction(String username,String password) {
		usn.sendKeys(username);
		psw.sendKeys(password);
		loginBtn.click();
	}
}
