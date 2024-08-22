package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QRCodeOR {

	@FindBy(xpath=("//div[text()=' Pay user ']")) public WebElement PayUser;
	@FindBy(xpath=("//div[text()='Receive QR-code']"))public WebElement RecevierQRCode;
	@FindBy(xpath=("//input[@autocomplete='off']"))public WebElement Amount;
	@FindBy(xpath=("//textarea[@rows='3']"))public WebElement Description;
	@FindBy(xpath=("//span[text()='Generate QR code']"))public WebElement GenerateQR;
	
	public QRCodeOR (WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	public void QRCodeDetails(String Amount1,String Descripte) {
		PayUser.click();
		RecevierQRCode.click();
		Amount.sendKeys(Amount1);
		Description.sendKeys(Descripte);
		GenerateQR.click();
	}
}
