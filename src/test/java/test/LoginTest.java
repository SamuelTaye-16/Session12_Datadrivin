
package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashBoardPage;
import page.LoginPage;
import util.BrowserFactory;
import util.ExcelReader;

public class LoginTest {

	WebDriver driver;
	
	ExcelReader reader = new ExcelReader("./ExcelData/Excel4.xlsx");
	String UserName =reader.getCellData("LoginTest", "UserName", 2);
	String Password = reader.getCellData("LoginTest", "Password", 2);
	

	@Test
	public void loginTest() {
		
		  driver = BrowserFactory.init();
		  
		  LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		  loginpage.enterUserName(UserName);
		  loginpage.enterPassword(Password); 
		  loginpage.clickSignInButton();
		  
		  
		  //DashBoardPage dashboard = PageFactory.initElements(driver, DashBoardPage.class);
		  //dashboard.validatDashBoardElement();
		  
		 
		 
	}

}
