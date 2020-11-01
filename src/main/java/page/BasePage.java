package page;

import java.util.Random;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	static WebDriver driver;

	public static void waitForElement(WebDriver driver, int timeInSeconds, WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver, timeInSeconds);
		wait.until(ExpectedConditions.invisibilityOf(element));

	}

	public static int randomNumGenerator() {
		Random rnd = new Random();
		int randomNum = rnd.nextInt(999);
		return randomNum;

	}

	public static void dropDown(WebElement locator, String visibleText) {
		Select sel = new Select(locator);
		sel.selectByVisibleText(visibleText);
	}

}