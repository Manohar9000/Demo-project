package testScript;

import java.io.IOException;

import org.testng.annotations.Test;

import Config.Driver;
import Pages.FB_Login_OR;
import testData.ExcelUtils;

public class Fb_pageFactory extends Driver{

	@Test
	public void fbTest() throws InterruptedException, IOException {
		
		driver.get("https://www.facebook.com/");
		FB_Login_OR fb = new FB_Login_OR(driver);
		ExcelUtils excel = new ExcelUtils("C:\\Users\\MANOHAR\\OneDrive\\Desktop\\FbLogin.xlsx","Sheet1");
		fb.fb_SignUp(excel.getCellData(0, 0),excel.getCellData(0, 1),excel.getCellData(1, 0),excel.getCellData(1, 1));
	}
}
