package step_definitions;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.DBUtils;

public class DB_Room_capacity_StepDefs {
	List<Map<String, Object>> queryResult = new ArrayList<Map<String, Object>>();
	
	@Given("User has connection to the database and send the request in JDBC")
	public void user_has_connection_to_the_database() {	
	String sql = "select name, id, capacity from room where withtv = true and withwhiteboard = true and cluster_id = 4 and id in(121, 122);";
	queryResult = DBUtils.getQueryResultMap(sql); 
	}

	@Then("compare the response with expected")
	public void compare_the_response_with_expected() {
	List<Map<String, Object>> expmap = new ArrayList<Map<String, Object>>();
	Map<String, Object> a = new HashMap();
	a.put("name", "kilimanjaro");
	a.put("id", "121");
	a.put("capacity", "6");
	expmap.add(a);
	Map<String, Object> b = new HashMap();
	b.put("name", "half dome");
	b.put("id", "122");
	b.put("capacity", "6");
	expmap.add(b);
	
	assertEquals(expmap, queryResult);
	  
	}


}
