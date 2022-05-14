package mouse_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_click {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Rut's\\selenium-java-4.1.3\\Webdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		
		driver.switchTo().frame("iframeResult");
		WebElement field1=driver.findElement(By.xpath("//input[@id='field1']"));
		field1.clear();
		Thread.sleep(3000);
		field1.sendKeys("It's Not Difficult For Me '_' ");
		Thread.sleep(3000);
		WebElement button=driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
		Actions act=new Actions(driver);
		Thread.sleep(3000);
		act.doubleClick(button).perform();

	}

}
