package testng_multiple_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SimpleOR {

	@FindBy(id="radio1")WebElement Male;
	@FindBy(id="alert1")WebElement AlertDemo;
	@FindBy(id="checkbox2")WebElement checkbox;
	@FindBy(id="prompt")WebElement promt;
	@FindBy(id="confirm")WebElement conformation;
	@FindBy(name="vehicle")WebElement vehical;
	@FindBy(xpath="//input[@name='accessories' and  @value='Pen']")WebElement pen;
	
	SimpleOR(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	WebDriver driver;
	public void  Details() throws InterruptedException {
		Male.click();
		Thread.sleep(2000);
		AlertDemo.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		checkbox.click();
		Thread.sleep(2000);
		promt.click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
		conformation.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		vehical.click();
		Thread.sleep(2000);
		pen.click();
		Thread.sleep(2000);
		
	}
}
