package stepDiff;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import Config.Driver;
import Pages.FB_Login_OR;
import io.cucumber.java.en.*;

public class SignUpDiff extends Driver {

	
	FB_Login_OR  Fblogin;
	@Given("if user is on Homepage")
	public void if_user_is_on_homepage() {
		
		driver.get(url);
		Fblogin = new FB_Login_OR(driver);
	}
	
	@When("Click on the Create new Account Button")
	public void click_on_the_create_new_account_button() {
		Fblogin.CreateAccount.click();
	}
	@When("Enter the FirstName as {string} and LastName as {string}")
	public void enter_the_first_name_as_and_last_name_as(String firstname, String lastname) throws InterruptedException {
		Fblogin.FirstName.sendKeys(firstname);
	    Thread.sleep(2000);
	    Fblogin.SurName.sendKeys(lastname);
	}
	
	    @When("Enter the MobileNumber as {string} and Password as {string}")
	    public void enter_the_mobile_number_as_and_password_as(String Mobile, String password) throws InterruptedException {
	      
	    	Fblogin.MobileNumber.sendKeys(Mobile);
		    Thread.sleep(2000);
		    Fblogin.password.sendKeys(password);
		    Thread.sleep(2000);
	    }
	    @When("Select the Date  and Month and Year")
	    public void select_the_date_and_month_and_year() throws InterruptedException {
	    	Select date = new Select(driver.findElement(By.id("day")));
		    date.selectByValue("7");
		    Thread.sleep(2000);
		    Select month = new Select(driver.findElement(By.id("month")));
		    month.selectByVisibleText("Jun");
		    Thread.sleep(2000);
		    Select year = new Select(driver.findElement(By.id("year")));
		    year.selectByVisibleText("1993");
		    Thread.sleep(2000);
	    }

	@When("Click on the Male RadioButton")
	public void click_on_the_male_radio_button() {
		Fblogin.Male.click();
	}

	@Then("Verify the SignUp button and Click on the SignUP button")
	public void verify_the_sign_up_button_and_click_on_the_sign_up_button() {
	   assertTrue(driver.findElement(By.xpath("//button[@name='websubmit']")).isDisplayed());
	   
	}

}
