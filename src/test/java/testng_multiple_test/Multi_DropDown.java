package testng_multiple_test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

public class Multi_DropDown extends Driver {

 /*	WebDriver driver;
	@BeforeMethod
	public void Setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MANOHAR\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(3));
	} */
	@Test(priority=4)
	public void MultiDropDown() throws InterruptedException {
		driver.get("https://omayo.blogspot.com/");
		Select mm = new Select(driver.findElement(By.id("multiselect1")));
		for(int i=0;i<mm.getOptions().size();i++) {
			mm.selectByIndex(i);
			Thread.sleep(500);
		}
		Thread.sleep(500);
		mm.deselectAll();
		Thread.sleep(500);
	}
 /*	@AfterMethod
	public void TearDown() {
		driver.quit();
	} */
}
