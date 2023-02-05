package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObjects {

	
	
	@FindBy(name="username")
	WebElement userNameInputbox;
	
	@FindBy(xpath = "//input[@type=\"password\"]")
	WebElement passwordInputbox;
	
	@FindBy(xpath = "//button[@type=\"submit\"]")
	WebElement loginBtn;
	
	
	public LoginPageObjects(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean isUserNameInputboxPreset() {
		boolean status = userNameInputbox.isDisplayed();
		return status;
	}
	

	public void setUserName(String uName) {
		userNameInputbox.clear();
		userNameInputbox.sendKeys(uName);
	}
	
	
	public boolean isPasswordInputboxPreset() {
		boolean status = passwordInputbox.isDisplayed();
		return status;
	}
	

	public void setPassword(String pwd) {
		passwordInputbox.clear();
		passwordInputbox.sendKeys(pwd);
	}
	
	
	public boolean isLoginBtnEnabled() {
		boolean status = loginBtn.isEnabled();
		return status;
	}
	
	public void clickLoginBtn() {
		loginBtn.click();
	}
	
	
	public void login(String uName, String pwd) {
		this.setUserName(uName);
		this.setPassword(pwd);
		this.clickLoginBtn();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
