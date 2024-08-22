package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyVochars  {

	@FindBy(xpath="(//a[contains(@href, '/banking/self/vouchers')])[2]")public WebElement voucharLink;
	@FindBy(xpath="//div[text()='Business directory']")public WebElement BusinessDirectory;
	@FindBy(xpath="//div[text()='Order by']")public WebElement OrderBy;
	@FindBy(xpath="//a[text()= ' Name (A-Z) ' ]")public WebElement AZ;
	@FindBy(xpath="//input[@type='text']")public WebElement Keywords;
	@FindBy(xpath="//a[text()='www.henderson.test.com']")public WebElement annsCafe;
	@FindBy(xpath="//div[text()='Make payment']")public WebElement makepayment;
	@FindBy(xpath="//input[@type='tel']")public WebElement Amount;
	@FindBy(xpath="//button[@aria-haspopup='true']")public WebElement Scheduling;
	@FindBy(xpath="//a[text()=' Monthly installments ']")public WebElement Monthly;
	@FindBy(xpath="//input[@type='number']")public WebElement instalment;
	@FindBy(xpath="//label[text()=' Now ']")public WebElement Finstalment;
	@FindBy(xpath="//textarea[@rows='3']")public WebElement Description;
	@FindBy(xpath="//span[text()='Next']") WebElement next;
	@FindBy(xpath="//span[text()='Confirm']")public WebElement confirm;
	@FindBy(xpath="//div[text()='The payment was successfully processed']")public WebElement successfully;

	
	public MyVochars(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	public void vouches(String keywords,String amount,String Ninstalment,String Descript ) {
		voucharLink.click();
		BusinessDirectory.click();
		OrderBy.click();
		AZ.click();
		Keywords.sendKeys(keywords);
		annsCafe.click();
		makepayment.click();
		Amount.sendKeys(amount);
		Scheduling.click();
		Monthly.click();
		instalment.sendKeys(Ninstalment);
		Finstalment.click();
		Description.sendKeys(Descript);
		next.click();
		confirm.click();
		successfully.click();
		
	}
	
}
