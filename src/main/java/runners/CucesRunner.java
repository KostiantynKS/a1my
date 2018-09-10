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
			"json:target/cucumber.xml"
			},
			tags = "@smoke",
			features = {"src/test/resources"},
			glue={"src/main/java/runners/CucesRunner.java"},
			dryRun=false
			)
	
public class CucesRunner {
}
