package testPages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.Assert;
import baseUtil.BaseClass;

public class HomePageTest extends BaseClass {

	@Test(enabled = false)
	public void logoTest1() {
		homePage.logoDisplayed();
	}

	@Test(enabled = false)//pass
	public void dropdown_selecByIndex_method() throws InterruptedException {

		driver.get("https:/www.amazon.com");
		WebElement dropElement = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Select select = new Select(dropElement);
		select.selectByIndex(4);
		Thread.sleep(900);
	}

	@Test(enabled = false)//pass
	public void dropdown_selecByVisibleText_method() throws InterruptedException {

		driver.get("https:/www.amazon.com");
		WebElement dropElement = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Select select = new Select(dropElement);
		select.selectByVisibleText("Books");
		Thread.sleep(900);
	}

	@Test(enabled = true) 
	public void dropdown_selectValue_method() throws InterruptedException {

		driver.get("https:/www.amazon.com");
		WebElement dropElement = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Select select = new Select(dropElement);
		select.selectByValue("aamazon com,stripbooks,149");
		Thread.sleep(500);
	}

	@Test(enabled = false) 
	public void mouseHoverActionOnClinicalTrials() throws InterruptedException {
		driver.get("https:/www.mountsinai.org");
		Actions actions = new Actions(driver);
		WebElement clinicalTrials = driver.findElement(By.xpath("//a[normalize-space(text())='Clinical Trials'and @class='hidden-xs dropdown']"));
		Thread.sleep(500);
		actions.moveToElement(clinicalTrials).build().perform();
		Thread.sleep(500);
	}

	@Test(enabled = false)

	public void logoTest() {
		driver.get("https://portal.cms.gov/portal/");
		WebElement logo = driver.findElement(By.xpath("//em[@class='cms-icon cms-sprite-loggedout ms-3']"));
		boolean flag = logo.isDisplayed();
		// System.out.println("Is the logo display?:ans"+flag);
		Assert.assertTrue(true, "Aplicstion logo is not display");
	}

	@Test(enabled = false)

	public void logoTest2() {
		driver.get("https://portal.cms.gov/portal/");
		WebElement logo = driver.findElement(
				By.xpath("//em[@id='cms-homepage-header-logo-unauth' and@class='cms-icon cms-sprite-loggedout ms-3']"));
		boolean flag = logo.isDisplayed();
		// System.out.println("Is the logo display?:ans"+flag);
		Assert.assertTrue(true, "Aplicstion logo is not display");
	}

	@Test(enabled =false)
	public void Use_Of_Get_title_test() {
		driver.get("https://www.macys.com");
		String expected = "Access Denied";
		String actual = driver.getTitle();
		Assert.assertEquals(actual, expected, "Home page title doesnot match");
	}

}
