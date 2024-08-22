package stepDeff;

import org.openqa.selenium.By;

import config.Driver;
import io.cucumber.java.en.When;
import pages.QRCodeOR;

public class QRCodeDeff extends Driver{
   
	QRCodeOR QRCodepage;
	@When("Click the payUser;")
	public void click_the_pay_user() throws InterruptedException {
		QRCodepage = new QRCodeOR(driver);
		QRCodepage.PayUser.click();
		    Thread.sleep(2000);
	}

	@When("Click the Recevier QRCode;")
	public void click_the_recevier_qr_code() throws InterruptedException {
		QRCodepage.RecevierQRCode.click();
	    Thread.sleep(2000);
	}
	
	@When("Enter the Amount as {string};")
	public void enter_the_amount_as(String amount) throws InterruptedException {
		QRCodepage.Amount.sendKeys(amount);
	    Thread.sleep(2000);
	}

	@When("Enter the Text into Description {string};")
	public void enter_the_text_into_description(String Discript) throws InterruptedException {
		QRCodepage.Description.sendKeys(Discript);
	    Thread.sleep(2000);
	    QRCodepage.GenerateQR.click();
	    Thread.sleep(2000);
	}
	
	
	
}
