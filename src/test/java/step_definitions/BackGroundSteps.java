package step_definitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.StartingPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class BackGroundSteps {
	String email= ConfigurationReader.getProperty("email");
	String password = ConfigurationReader.getProperty("password");
	String actual = "";
	String expected = "";
	
	
	@Given("User is on the sign in page")
	public void user_is_on_the_sign_in_page() {
		actual =  Driver.getDriver().getTitle();
		expected = "cybertek-bnb";
		assertTrue(actual.equals(expected));
	  
	}

	@When("User put his valid credentials such as email and username")
	public void user_put_his_valid_credentials_such_as_email_and_username() throws InterruptedException {
		StartingPage sp = new StartingPage();
		 sp.emailField.sendKeys(email);
		 sp.passwordField.sendKeys(password);
		 
		// Thread.sleep(2000);
		 
		 sp.signInButton.click();

	}

	@Then("Verify that User is on the homePage")
	public void verify_that_User_is_on_the_homePage() {
		actual =  Driver.getDriver().getTitle();
		expected = "cybertek-bnb";
		assertTrue(actual.equals(expected));
	
	}


}
