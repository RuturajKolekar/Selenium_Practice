package waits;

import java.time.Duration;
import java.util.NoSuchElementException;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class FluentWaitExample2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Rut's\\selenium-java-4.1.3\\Webdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();


		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("selenium",Keys.RETURN);
		By locator=By.xpath("//h3[text()='Selenium']");
		waitForElementWithFluentWait(driver,locator).click();


	}

	public static WebElement waitForElementWithFluentWait(WebDriver driver,By locator) {
		Wait<WebDriver> mywait=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);

		WebElement ele=mywait.until(new Function<WebDriver,WebElement>(){
			public WebElement apply(WebDriver driver) {
				return driver.findElement(locator);
			}
		});
		return ele;
	}
}


