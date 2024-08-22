package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FB_Login_OR {


	@FindBy(xpath="//a[text()='Create new account']")public WebElement CreateAccount;
	@FindBy(xpath="//input[@name='firstname']")public WebElement FirstName;
	@FindBy(xpath="//input[@name='lastname']")public WebElement SurName;
	@FindBy(xpath="//input[@aria-label='Mobile number or email address']")public WebElement MobileNumber;
	@FindBy(xpath="//input[@autocomplete='new-password']")public WebElement password;
	@FindBy(id="day") public WebElement Day;
	@FindBy(id="month")public WebElement month;
	@FindBy(id="year")public  WebElement year;
	@FindBy(xpath="//label[text()='Male']")public WebElement Male;
	@FindBy(xpath="//button[@name='websubmit']")public WebElement SignUp;
	
	public FB_Login_OR(WebDriver driver){
		
		PageFactory.initElements(driver, this);
	}
	
	public void fb_SignUp(String firstname,String surname,String mobilenumber,String Password) throws InterruptedException {

		CreateAccount.click();
		Thread.sleep(2000);
		FirstName.sendKeys(firstname);
		Thread.sleep(2000);
		SurName.sendKeys(surname);
		Thread.sleep(2000);
		MobileNumber.sendKeys(mobilenumber);
		Thread.sleep(2000);
		password.sendKeys(Password);
		Thread.sleep(2000);
		Day.click();
		Select day = new Select(Day);
		day.selectByValue("7");
		Thread.sleep(2000);
		month.click();
		Select Month = new Select(month);
		Month.selectByVisibleText("Jun");
		Thread.sleep(2000);
		year.click();
		Select Year = new Select(year);
		Year.selectByVisibleText("1993");
		Thread.sleep(2000);
		Male.click();
		Thread.sleep(2000);
		SignUp.click();
		Thread.sleep(2000);
		
		
	}
	
}
