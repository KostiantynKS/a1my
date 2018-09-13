package step_definitions;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePage;
import pages.StartingPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class GoHunt_StepDefs {
	
	String actual = "";
	String expected = "";
	String email= ConfigurationReader.getProperty("url");
	String password = ConfigurationReader.getProperty("password");
	@Given("User already logged and on the HomePage")
	public void user_already_logged_and_on_the_HomePage() {
		StartingPage sp = new StartingPage();
		 sp.emailField.sendKeys(email);
		 sp.passwordField.sendKeys(password);
		 sp.signInButton.click();
	  actual = Driver.getDriver().getTitle();
	  expected = "cybertek-bnb";
	  assertEquals(expected, actual);
	   
	}

	@When("User click on the hunt button")
	public void user_click_on_the_hunt_button() {
	   HomePage mp = new HomePage();
	   mp.huntButton.click();
	    
	}

	@Then("User should be on the on the hunting page")
	public void user_should_be_on_the_on_the_hunting_page() {
		actual = Driver.getDriver().getTitle();
	    expected = "hunt for spot";
	    assertEquals(expected, actual);
	}



}
