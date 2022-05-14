package seleniumTest;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Rut's\\selenium-java-4.1.3\\Webdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com");
//		driver.findElement(By.xpath("//input[@id='small-searchterms']")).click();
//		driver.findElement(By.xpath("//input[@id='small-searchterms' and @name='q']")).click();
//		driver.findElement(By.xpath("//a[contains(text(),'nopCommerce new release!')]")).click();
//		driver.findElement(By.xpath("//a[starts-with(text(),'nopCommerce ')]")).click();
		driver.findElement(By.xpath("//input[starts-with(@id,'small')]")).click();
		
		
		
		Thread.sleep(2000);
		
		driver.quit();
		

	}

}
