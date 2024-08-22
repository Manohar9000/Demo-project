package stepDeff;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import config.Driver;
import io.cucumber.java.en.*;
import pages.LoginOR;

public class LoginDef extends Driver {

	LoginOR loginpage;
	
	@Given("If user is on home page;")
	public void if_user_is_on_home_page() {
		driver.get(url);
		loginpage = new LoginOR(driver);
	}

	@When("Click on login link;")
	public void click_on_login_link() throws InterruptedException {
		loginpage.linkLogin.click();
	   Thread.sleep(2000);
	}
	
	@When("Enter The username As {string} and password as {string};")
	public void enter_the_username_as_and_password_as(String username, String password) throws InterruptedException {
		    loginpage.tfusername.clear();
		    loginpage.tfusername.sendKeys(username);
		   Thread.sleep(2000);
		   loginpage.tfpassword.clear();
		   loginpage.tfpassword.sendKeys(password);
		   loginpage.Submit.click();
		   Thread.sleep(2000);
	}

	
	@Then("Verify logout link;")
	public void verify_logout_link() throws InterruptedException {
		assertTrue(loginpage.linLogout.isDisplayed());
		loginpage.linLogout.click();
	    Thread.sleep(2000);
	   
	}
	
}
