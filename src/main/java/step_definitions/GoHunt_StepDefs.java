package step_definitions;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.Driver;

public class GoHunt_StepDefs {
	
	String actual = "";
	String expected = "";
	
	@Given("User already logged and on the HomePage")
	public void user_already_logged_and_on_the_HomePage() {		
	  actual = Driver.getDriver().getTitle();
	  expected = "cybertek-bnb";
	  assertEquals(expected, actual);
	   
	}

//	@When("User click on the hunt button")
//	public void user_click_on_the_hunt_button() {
//	    // Write code here that turns the phrase above into concrete actions
//	    
//	}
//
//	@Then("User should be on the on the hunting page")
//	public void user_should_be_on_the_on_the_hunting_page() {
//	    // Write code here that turns the phrase above into concrete actions
//	    
//	}



}
