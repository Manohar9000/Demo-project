package testng_multiple_test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

public class DropDown extends Driver {


	@Test(priority=2)
	public void Dropdown() throws InterruptedException {
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(3000);
		Select dd = new Select(driver.findElement(By.id("drop1")));
		Thread.sleep(3000);
		dd.selectByIndex(3);
		
	}
}
