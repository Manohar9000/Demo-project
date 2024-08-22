package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginOR {

	@FindBy(id="login-link")public WebElement linkLogin;
	@FindBy(xpath="//input[@autocomplete='username']") public WebElement tfusername;
	@FindBy(xpath="//input[@autocomplete='password']")public WebElement tfpassword;
	@FindBy(xpath="//span[text()='Submit']") public WebElement Submit;
    @FindBy(id ="logout-trigger") public WebElement linLogout;
    
    public LoginOR(WebDriver driver){
    	
    	PageFactory.initElements(driver, this);
    }
    public void FillLoginDetails(String uname,String password) throws InterruptedException {
    	
    	//linkLogin.click();
    	
    	tfusername.sendKeys(uname);
    	Thread.sleep(2000);
    	tfpassword.sendKeys(password);
    	Thread.sleep(2000);
    	Submit.click();
    	Thread.sleep(2000);
    	linLogout.click();
    	
    }
}
