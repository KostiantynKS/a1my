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
		"json:target/cucumber.xml",
		"rerun:target/rerun.txt"
		},
		//tags = "@smoke",
		features = "@target/rerun.txt",
		glue={"step_definitions"},
		dryRun=false
		)


public class FailedScenario {

}
