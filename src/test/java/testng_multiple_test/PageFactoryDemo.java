package testng_multiple_test;

import org.testng.annotations.Test;

public class PageFactoryDemo extends Driver {

	@Test
	public void Demo() throws InterruptedException {
		driver.get("https://omayo.blogspot.com/");
		SimpleOR simple = new SimpleOR(driver);
		simple.Details();
		
		
		
	}
}
