package steps;

import org.junit.Assert;
import org.openqa.selenium.By;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.de.Aber;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Database;
import pages.LoginPage;
import pages.TestBase;

public class LoginStepDefinition extends TestBase {
	LoginPage loginPage;
	Database database;
 
	@Before
	public void beforeRun() {
		init();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		database=new Database();
	}

	@Given("^User is on Techfios login page$")
	public void user_is_on_Techfios_login_page() {

		driver.get("https://www.techfios.com/billing/?ng=admin/");
		takeScreenshoot(driver);

	}
	@When("^User enters username as \"([^\"]*)\"$")
	public void user_enters_username_as(String useraname){
	    loginPage.insertUserName(useraname);
	}

	@When("^User enters password as \"([^\"]*)\"$")
	public void user_enters_password_as(String password){
	    loginPage.intertPassword(password);
	}
	
    @When("^User Should land on dashboard page$")
	public void user_Should_land_on_dashboard_page() {
		Assert.assertEquals("Dashboard- iBilling", loginPage.getPageTitle());
		takeScreenshoot(driver);
	}
	@When("^User clicks signin button$")
	public void user_clicks_signin_button() {
		loginPage.login();
	}
	@When("^User enters username from database$")
	public void user_enters_username_from_database() {
		loginPage.insertUserName(database.getData("username"));
	}
	
	@When("^User enters password from database$")
	public void user_enters_password_from_database() {
	 loginPage.intertPassword(database.getData("password"));	
	}

	@After
	public void AfterRun() {
		tearDown();
	}

}
