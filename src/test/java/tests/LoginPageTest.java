package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;

public class LoginPageTest extends TestBase{

	
	@Test(priority = 1)
	public void verifyLogin() {

		Assert.assertTrue(lp.isUserNameInputboxPreset());
		System.out.println("Enter username");
		lp.setUserName("Admin");
		
		Assert.assertTrue(lp.isPasswordInputboxPreset(), "Password Inputbox not present in the UI");
		System.out.println("Enter password");
		lp.setPassword("admin123");
		
		System.out.println("Click on login Button");
		Assert.assertTrue(lp.isLoginBtnEnabled());
		lp.clickLoginBtn();
		
		Assert.assertTrue(dp.isDashboardTitlePresent());
		
	}
	
}
