package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPageObjects {

	@FindBy(xpath = "//h6[text()=\"Dashboard\"]")
	WebElement dashboardTitle;
	
	@FindBy(xpath = "//p[@class=\"oxd-userdropdown-name\"]")
	WebElement profileMenuDD;
	
	@FindBy(xpath = "//a[text()=\"Logout\"]")
	WebElement logout;
	
	@FindBy(xpath = "//span[text()=\"Admin\"]")
	WebElement adminMenu;
	
	public DashboardPageObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public boolean isDashboardTitlePresent() {
		boolean status = dashboardTitle.isDisplayed();
		return status;
	}
	
	public String getTitle() {
		return dashboardTitle.getText();
	}
	
	public void clickProfileMenu() {
		profileMenuDD.click();
	}
	
	public void clickLogout() {
		logout.click();
	}
	
	public void logout() {
		this.clickProfileMenu();
		this.clickLogout();
	}
	
	public void clickAdminMenu() {
		adminMenu.click();
	}
}
