package config;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Driver {

	public static WebDriver driver;
	public static String url="https://demo.cyclos.org/ui/home";
	@BeforeSuite
	public static void LunchBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MANOHAR\\Downloads\\chromedriver\\chromedriver.exe");  
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(3));
		driver.manage().deleteAllCookies();
		
	}

    @AfterSuite
    public static void closeBrowser() {
	
	    driver.quit();
    }

}
