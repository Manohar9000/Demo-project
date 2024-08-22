package stepDeff;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"FeatureFiles"},   
		glue = {"stepDeff"},
		plugin = {"pretty",
				  "html:target/report/cucumber.html",
				  "json:target/report/cucumber.json"
		       },
		
		   // dryRun = true
		   // plugin = {"monocromota.cucumber.reprt.prettyReports:target/cucumber" },
           // plugin = {"monocromota.cucumber.reprt.prettyReports:target/cucumber","json.target/Report/Cucumber.json"}
		  tags = "@Manohar"
		)

public class TestRunner extends AbstractTestNGCucumberTests {

}
