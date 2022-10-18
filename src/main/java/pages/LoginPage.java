package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//input[@id='username']")
	WebElement USERNAME;

	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	WebElement PASSWORD;

	@FindBy(how = How.XPATH, using = "//button[@name='login']")
	WebElement LOGIN;

	public void insertUserName(String username) {
		USERNAME.sendKeys(username);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	public void intertPassword(String password) {
		PASSWORD.sendKeys(password);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void login() {
		LOGIN.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}

	public String getPageTitle() {
		return driver.getTitle();
	}
	
	

}
