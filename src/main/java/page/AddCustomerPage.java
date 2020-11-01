package page;

import java.util.Random;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class AddCustomerPage extends BasePage {
	
	WebDriver driver;
	  
	  
	  public AddCustomerPage(WebDriver driver) { 
		  this.driver = driver;
	  
	  }
	  
	  @FindBy(how =How.XPATH,using = "//*[@id=\"side-menu\"]/li[3]/a/span[1]") WebElement CUSTOMER_ELEMENT_LOCATOR;
	  @FindBy(how =How.XPATH,using = "//*[@id=\"side-menu\"]/li[3]/ul/li[1]/a") WebElement ADD_CUSTOMER_ELEMENT_LOCATOR;
		@FindBy(how =How.XPATH,using = "//*[@id=\"account\"]") WebElement FULLNAME_FIELD_LOCATOR;
		@FindBy(how =How.XPATH,using = "//*[@id=\"cid\"]") WebElement COMPANY_DROPDOWN_LOCATOR;
		@FindBy(how =How.XPATH,using = "//*[@id=\"email\"]") WebElement EMAIL_ELEMENT_LOCATOR;
		@FindBy(how =How.XPATH,using = "//*[@id=\"phone\"]") WebElement PHONE_FIELD_LOCATOR;
		@FindBy(how =How.XPATH,using = "//*[@id=\"address\"]") WebElement ADDRESS_FIELD_LOCATOR;
		@FindBy(how =How.XPATH,using = "//*[@id=\"city\"]") WebElement CITY_ELEMENT_LOCATOR;
		@FindBy(how =How.XPATH,using = "//*[@id=\"state\"]") WebElement STATE_FIELD_LOCATOR;
		@FindBy(how =How.XPATH,using = "//*[@id=\"zip\"]") WebElement ZIP_FIELD_LOCATOR;
		@FindBy(how =How.XPATH,using = "//*[@id=\"submit\"]") WebElement SAVE_BUTTON_LOCATOR;
		@FindBy(how =How.XPATH,using = "//*[@id='summary']") WebElement SUMMARY_BUTTON_LOCATOR;

		//@FindBy(how =How.XPATH,using = "//*[@id=\"side-menu\"]/li[3]/ul/li[2]/a") WebElement LIST_CUSTOMER_LOCATOR;



		
		
		public void clickCustomersButton() {
			CUSTOMER_ELEMENT_LOCATOR.click();
		}
		
		public void clickAddcustomerButton() throws InterruptedException {
			ADD_CUSTOMER_ELEMENT_LOCATOR.click();
			Thread.sleep(3000);
		}
		public void insertFullName(String Fullname) {
		    String enteredName = Fullname + BasePage.randomNumGenerator()  ;
			FULLNAME_FIELD_LOCATOR.sendKeys(enteredName);
			
		}
		
		public void insertcompanyName(String company) {
			BasePage.dropDown(COMPANY_DROPDOWN_LOCATOR,company);
		}
		
		public void insertEmail(String email) {
			String enteredEmail =  email + BasePage.randomNumGenerator();
			EMAIL_ELEMENT_LOCATOR.sendKeys(enteredEmail);
 		}
		
		public void insertPhone(String Phone) {
			String enteredPhone = BasePage.randomNumGenerator() + Phone;
			PHONE_FIELD_LOCATOR.sendKeys(enteredPhone);
		}
		
		public void insertAddress(String Address) {
			ADDRESS_FIELD_LOCATOR.sendKeys(Address);
		}
		
		public void insertCity(String City) {
			CITY_ELEMENT_LOCATOR.sendKeys(City);
		}
		
		public void insertState(String State) {
			STATE_FIELD_LOCATOR.sendKeys(State);
		}
		
		public void insertZip(String Zip) {
			ZIP_FIELD_LOCATOR.sendKeys(Zip);
		}
		
		public void clickSaveButton() {
			SAVE_BUTTON_LOCATOR.click();
		}
		
		 // public void clickOnListCustomerButton() { 
			//  LIST_CUSTOMER_LOCATOR.click();
		  
		 // }
		  
		  public void summary() {
			  SUMMARY_BUTTON_LOCATOR.click();
		  }
		 
		
		
		
}
