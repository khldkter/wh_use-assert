package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//img[@class='bc-logo logo-us'])[2]")
	WebElement logo;

	public boolean logoDisplayed() {
		boolean flag = logo.isDisplayed();
		System.out.println("is the logo displayed" + flag);
		return flag;
	}
}
