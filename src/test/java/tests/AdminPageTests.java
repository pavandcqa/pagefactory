package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;

public class AdminPageTests extends TestBase{

	@Test
	public void verifySearchWithUserName() {
		
		lp.login("Admin", "admin123");
		dp.clickAdminMenu();
		ap.setUserName("Admin");
		ap.clickSearchBtn();
		Assert.assertTrue(ap.isRecordCountDisplayed(), "No RecordsFound");
	}
}
