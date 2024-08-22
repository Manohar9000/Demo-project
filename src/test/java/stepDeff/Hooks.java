package stepDeff;

import config.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	@Before
	public void BeforeScenario() {
		
		System.out.println("*************BeforeScenario****************");
		Driver.LunchBrowser();
	}
	
	@After
	public void AfterScenario() {
		
		System.out.println("************After Scenario******************");
		Driver.closeBrowser();
	}
}
