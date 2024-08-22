package Config;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Driver {

	public static WebDriver driver;
	public static String url = "https://www.facebook.com/";
	public static String browser="GC";
	@BeforeMethod
	public static void Setup() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MANOHAR\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		if(browser.equals("GC")) {
		
		     driver = new ChromeDriver();
		}
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(3));
		 
	}
	@AfterMethod
	public static void TearDown() {
		driver.quit();
	}
}
