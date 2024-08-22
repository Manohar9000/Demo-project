package testng_multiple_test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Double_Click extends Driver{

//	WebDriver driver;
//	@BeforeMethod
//	public void Setup() {
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\MANOHAR\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(3));
//	}
	@Test(priority=3)
	public void doubleclick() throws InterruptedException {
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(2000);
		Actions a = new Actions(driver);
		Thread.sleep(2000);
		a.doubleClick(driver.findElement(By.xpath("//button[@ondblclick='dblclickAlert()']"))).perform();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
	}
//	@AfterMethod
//	public void TearDown() {
//		driver.quit();
//	}
}
