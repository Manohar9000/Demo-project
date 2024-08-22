package stepDiff;

import Config.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	@Before
	public void BeforeScenario() {
		System.out.println("*******************BeforeScenario*****************");
		Driver.Setup();
	}
	@After
	public void AfterScenario() {
		System.out.println("***********************After*******************");
		Driver.TearDown();
	}
}
