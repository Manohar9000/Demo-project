package stepDiff;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
			features = {"Feature File"},
			glue    =  {"stepDiff"},
			plugin = {"pretty",
					  "html:target/report/cucumber.html",
					  "json:target/report/cucumber.json"
					       } 
			//dryRun = true
			)

	public class TestRunner extends AbstractTestNGCucumberTests {

	
	}
	

