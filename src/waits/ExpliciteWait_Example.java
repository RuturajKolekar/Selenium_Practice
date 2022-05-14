package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpliciteWait_Example extends ExpliciteWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Rut's\\selenium-java-4.1.3\\Webdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("selenium",Keys.RETURN);
		
		WebElement obj=driver.findElement(By.xpath("//h3[text()='Selenium']"));
		By locator=By.xpath("//h3[text()='Selenium']");
		//WebDriverWait mywait=new WebDriverWait(driver, Duration.ofSeconds(10));
		//mywait.until(ExpectedConditions.visibilityOf(obj));
		//mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Selenium']")));
		//mywait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h3[text()='Selenium']")));
		//obj.click();
		
		//calling a Method
		waitForElementPresent(driver, locator, 10).click();	

	}

}
