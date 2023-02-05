package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPageObjects {

	@FindBy(xpath = "//label[text()=\"Username\"]/following::input[1]")
	WebElement userNameInputBox;
	
	@FindBy(xpath = "//button[@type=\"submit\"]")
	WebElement searchBtn;
	
	@FindBy(xpath = "//span[text()=\"(1) Record Found\"]")
	WebElement recordCount;
	
	public AdminPageObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setUserName(String uName) {
		
		userNameInputBox.clear();
		userNameInputBox.sendKeys(uName);
	}
	
	public void clickSearchBtn() {
		searchBtn.click();
		
	}
	
	public boolean isRecordCountDisplayed() {
		boolean status = recordCount.isDisplayed();
		return status;
	}
}
