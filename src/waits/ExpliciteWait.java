package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpliciteWait {
	public static WebElement waitForElementPresent(WebDriver driver, By locator,int timouts) {
		WebDriverWait mywait=new WebDriverWait(driver, Duration.ofSeconds(timouts));
		mywait.until(ExpectedConditions.presenceOfElementLocated(locator));
		return driver.findElement(locator);
	}

	public static void main(String[] args) {
		
	}

}
