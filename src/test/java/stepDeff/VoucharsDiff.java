package stepDeff;

import static org.testng.Assert.assertTrue;

import config.Driver;
import io.cucumber.java.en.*;
import pages.MyVochars;

public class VoucharsDiff extends Driver {

	MyVochars vocharpage;
	@When("click on the voucher link;")
	public void click_on_the_voucher_link() throws InterruptedException {
		vocharpage = new MyVochars(driver);
		vocharpage.voucharLink.click();
		Thread.sleep(2000);
	}

	@When("click on the Business Directory link;")
	public void click_on_the_business_directory_link() throws Exception {
		vocharpage.BusinessDirectory.click();
		Thread.sleep(2000);
		
	}
	
	@When("Enter the business directorys details;")
	public void enter_the_business_directorys_details() throws Exception {
		
		vocharpage.OrderBy.click();
		Thread.sleep(2000);
		vocharpage.AZ.click();
		Thread.sleep(2000);
	}

	@When("enter the Keywords as a\" <Ann's Cafe>\";")
	public void enter_the_keywords_as_a_ann_s_cafe() throws Exception {
		vocharpage.Keywords.sendKeys("Ann's Cafe");
		Thread.sleep(2000);
		vocharpage.annsCafe.click();
		Thread.sleep(2000);
	}
	

	@When("click on the make payment link;")
	public void click_on_the_make_payment_link() throws Exception {
		vocharpage.makepayment.click();
		Thread.sleep(2000);
	}

	@When("Enter the amount as {string};")
	public void enter_the_amount_as(String string) throws Exception {
		vocharpage.Amount.sendKeys("1200");
		Thread.sleep(2000);
	}

	@When("enter the Payment user details and Discript as {string};")
	public void enter_the_payment_user_details_and_discript_as(String string) throws Exception {
		vocharpage.Scheduling.click();
		Thread.sleep(2000);
		vocharpage.Monthly.click();
		Thread.sleep(2000);
		vocharpage.instalment.sendKeys("09");
		Thread.sleep(2000);
		vocharpage.Finstalment.click();
		Thread.sleep(2000);
		vocharpage.Description.sendKeys("hi manohar");
		Thread.sleep(2000);
		
		
		
	}

	
}
