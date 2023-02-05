package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pages.AdminPageObjects;
import pages.DashboardPageObjects;
import pages.LoginPageObjects;



public class TestBase {

	protected static WebDriver driver;
	protected LoginPageObjects lp;
	protected DashboardPageObjects dp;
	protected AdminPageObjects ap;

	public static void initializeBrowser(String browserOption) {
		
		if(browserOption.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if (browserOption.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./BrowserDrivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
	}
	
	@BeforeMethod
	public void setUp() {
		
		System.out.println("setup browser");

        initializeBrowser("firefox");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("navigate to https://opensource-demo.orangehrmlive.com");
		driver.get("https://opensource-demo.orangehrmlive.com");
		
		
		lp = new LoginPageObjects(driver);
		dp = new DashboardPageObjects(driver);
		ap = new AdminPageObjects(driver);
		
	}
	
	@AfterMethod
	public void closeBrowser() {
		System.out.println("logout form the application");
		dp.logout();
		driver.quit();
	}
}
