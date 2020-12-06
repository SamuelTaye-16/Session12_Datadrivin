package test;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.DashBoardPage;
import page.LoginPage;
import util.BrowserFactory;
import util.ExcelReader;

public class AddCustomerTest {

	WebDriver driver;

	ExcelReader reader = new ExcelReader("./ExcelData/Excel4.xlsx");
	String UserName = reader.getCellData("LoginTest", "UserName", 2);
	String Password = reader.getCellData("LoginTest", "Password", 2);
	String fullName = reader.getCellData("AddContactinfo", "FullName", 2);
	String Company = reader.getCellData("AddContactinfo", "Company", 2);
	String Email = reader.getCellData("AddContactinfo", "Email", 2);
	String Phone = reader.getCellData("AddContactinfo", "Phone", 2);
	String Address = reader.getCellData("AddContactinfo", "Address", 2);
	String City = reader.getCellData("AddContactinfo", "City", 2);
	String State = reader.getCellData("AddContactinfo", "State", 2);
	String Zip = reader.getCellData("AddContactinfo", "Zip", 2);

	@Test
	public void validUserShoulBeAbleToAddCustomer() throws InterruptedException {

		driver = BrowserFactory.init();

		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.enterUserName(UserName);
		loginpage.enterPassword(Password);
		loginpage.clickSignInButton();

		//DashBoardPage dashboard = PageFactory.initElements(driver, DashBoardPage.class);
		//dashboard.validatDashBoardElement();

		AddCustomerPage addCustomer = PageFactory.initElements(driver, AddCustomerPage.class);
		addCustomer.clickCustomersButton();
		addCustomer.clickAddcustomerButton();
		addCustomer.insertFullName(fullName);
		addCustomer.insertcompanyName(Company);
		addCustomer.insertEmail(Email);
		addCustomer.insertPhone(Phone);
		addCustomer.insertAddress(Address);
		addCustomer.insertCity(City);
		addCustomer.insertState(State);
		addCustomer.insertZip(Zip);
		addCustomer.clickSaveButton();
		addCustomer.clickOnListCustomerButton();

	}

}
