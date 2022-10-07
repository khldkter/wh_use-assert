package baseUtil;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.HomePage;

public class BaseClass {
	public WebDriver driver;
	public HomePage homePage;

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		// WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.get("https://www.macys.com");

		// driver.get("https://portal.cms.gov/portal/");
		// driver.get("https:/www.verizon.com");
		// driver.get("https:/www.mountsinai.org");
		 driver.get("https:/www.aamazon.com");
		// driver.get("https:/www.costco.com");
		homePage = new HomePage(driver);
	}

	@AfterMethod
	public void tearUp() {
		driver.quit();

	}

}
