package dropDowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_comlplete {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Rut's\\selenium-java-4.1.3\\Webdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.twoplugs.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//a[contains(text(),'Live Posting')]")).click();
		WebElement auto=driver.findElement(By.id("autocomplete"));
		Thread.sleep(3000);
		auto.clear();
		Thread.sleep(3000);
		auto.sendKeys("Toronto");
		Thread.sleep(3000);
		String text;
		do {
			auto.sendKeys(Keys.ARROW_DOWN);
			 text=auto.getAttribute("value");
			if(text.contains("USA")) {
				auto.sendKeys(Keys.ENTER);
				break;
			}
			Thread.sleep(3000);
		}while(!text.isEmpty());
		
		
	}
}
