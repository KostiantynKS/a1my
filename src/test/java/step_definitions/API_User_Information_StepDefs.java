package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import utilities.ConfigurationReader;

public class API_User_Information_StepDefs {
	String token;
	Response responce;
	
	@Given("I'm logged reservation API using {string} and {string}")
	public void i_m_logged_reservation_API_using_and(String username, String password) {
		RestAssured.baseURI = ConfigurationReader.getProperty("qa1_base_url");
	Response res = RestAssured.given().param("email", username).param("password", password)
	.when().get(RestAssured.baseURI+"/sign");
	token = res.jsonPath().get("accessToken");
	System.out.println(token);
	}

	@When("I get the current user information using the endpoint")
	public void i_get_the_current_user_information_using_the_endpoint() {
		RestAssured.basePath = "/students/me";
		responce = RestAssured.given().header("Authorisation", token).and().when().get();
	  
	}

	@Then("the information about current user should b returned")
	public void the_information_about_current_user_should_b_returned() {
	
	}



}
