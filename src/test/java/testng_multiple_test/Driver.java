package testng_multiple_test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Driver {
	
	WebDriver driver;
	@Parameters("browser")
	@BeforeMethod
	public void Setup(String browser) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MANOHAR\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		
		if(browser.equals("GC")) {
			driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(3));
	}
	@AfterMethod
	public void TearDown() {
		driver.quit();
	}
}
