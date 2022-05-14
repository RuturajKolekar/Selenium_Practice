package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitWait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Rut's\\selenium-java-4.1.3\\Webdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[text()='Web Tables']")).click();
		driver.findElement(By.id("addNewRecordButton")).click();
		driver.findElement(By.id("firstName")).sendKeys("Ruturaj");
		driver.findElement(By.id("lastName")).sendKeys("Kolekar");
		driver.findElement(By.id("userEmail")).sendKeys("Ruturaj@123.com");
		driver.findElement(By.id("age")).sendKeys("26");
		driver.findElement(By.id("salary")).sendKeys("15");
		driver.findElement(By.id("department")).sendKeys("MESA");
		
		
		
//		WebElement x=driver.findElement(By.id("submit"));
//		WebDriverWait wait=new WebDriverWait(driver, 10);
//        WebElement x = driver.findElement(By.id("submit"));
//		
//		WebDriverWait w=new WebDriverWait(driver,10);
//		w.until(ExpectedConditions.elementToBeClickable(x));
//		x.click();

		
	}

}
