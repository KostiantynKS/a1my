package step_definitions;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class GoSchedulePage {
	
	String actual = "";
	String expected = "";

	
	@Given("User already logged and on the HomePage")
	public void user_already_logged_and_on_the_HomePage() {
	  actual = Driver.getDriver().getTitle();
	  expected = "cybertek-bnb";
	  assertEquals(expected, actual);
	   
	}
	@When("User click on the schedule button")
	public void user_click_on_the_schedule_button() {
	HomePage hp = new HomePage();
	hp.huntButton.click();
	}

	@Then("User should be on the on the schedule page")
	public void user_should_be_on_the_on_the_schedule_page() {
	actual = Driver.getDriver().getTitle();
	expected = "cybertek-bnb";
	assertEquals(expected, actual);
	}



}
