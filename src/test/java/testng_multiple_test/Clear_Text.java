package testng_multiple_test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Clear_Text extends Driver{

//	WebDriver driver;
//	@BeforeMethod
//	public void Setup() {
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\MANOHAR\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(3));
//	}
	@Test(priority=1)
	public void clearText() throws InterruptedException {
		driver.get("https://omayo.blogspot.com/");
		//System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(),"omayo (QAFox.com)");
		Thread.sleep(500);
		driver.findElement(By.id("textbox1")).clear();
		Thread.sleep(500);
		driver.findElement(By.id("ta1")).sendKeys("manohar \n kalahasti");
		Thread.sleep(500);
		System.out.println(driver.findElement(By.id("but1")).isEnabled());
	}
//	@AfterMethod
//	public void TearDown() {
//		driver.quit();
//	}
}
