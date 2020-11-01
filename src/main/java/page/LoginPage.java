

  package page;
  
  import org.openqa.selenium.WebDriver;
  
  import org.openqa.selenium.WebElement; 
  import org.openqa.selenium.support.FindBy; 
  import org.openqa.selenium.support.How;
  
  public class LoginPage {
  
  WebDriver driver;
  
  
  public LoginPage(WebDriver driver) { 
	  this.driver = driver;
  
  }
  
  @FindBy(how = How.XPATH, using = "//input[@name='username']")WebElement
  USERNAME_FIELD;
  
  @FindBy(how = How.XPATH, using = "//input[@name='password']")WebElement
  PASSWORD_NAME_FIELD;
  
  @FindBy(how = How.NAME, using = "login")WebElement SIGNIN_BUTTON_FIELD;
  
  
  
  //Methods to interact with the element
  public void enterUserName(String  UserName) {
  USERNAME_FIELD.sendKeys(UserName);
  
  }
  
  public void enterPassword(String Password) {
  PASSWORD_NAME_FIELD.sendKeys(Password); }
  
  public void clickSignInButton() {
	  SIGNIN_BUTTON_FIELD.click(); }
  
  public void login(String userName, String password) {
  USERNAME_FIELD.sendKeys(userName);
  PASSWORD_NAME_FIELD.sendKeys(password);
  SIGNIN_BUTTON_FIELD.click();
  
  }
  
  
  }
  
  
  
 