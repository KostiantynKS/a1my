package runners;

import org.junit.runner.RunWith;


	
	@RunWith(Cucumber.class)
	@CucumberOptions(
			plugin = {
			"pretty",
			"html:target/default-cucumber-reports", //generates every time we run the cukes runner
			"json:target/cucumber.json"
			},
			tags = "@temp",
			features = {"a1my/src/test/resources/basic_scenarious.feature"},
			glue={"a1my/src/main/java/runners/CucesRunner.java"},
			dryRun=true	
			)
	
public class CucesRunner {
}
