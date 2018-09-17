package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	
@RunWith(Cucumber.class)
	@CucumberOptions(
			plugin = {
			"pretty",
			"html:target/default-cucumber-reports", //generates every time we run the cukes runner
			"json:target/cucumber.json",
			"junit:target/cucumber.xml",
			"rerun:target/rerun.txt"
			},
			tags = {"@temp"},
			features = {"src/test/resources"},
			glue={"step_definitions"},
			dryRun=true
			)
	
public class CukesRunner {
}
//java.lang.AssertionError: expected: java.util.ArrayList<[{name=kilimanjaro, id=121, capacity=6}, {name=half dome, id=122, capacity=6}]> 
//                           but was: java.util.ArrayList<[{name=kilimanjaro, id=121, capacity=6}, {name=half dome, id=122, capacity=6}]>

