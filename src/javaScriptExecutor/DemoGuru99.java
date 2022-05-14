package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoGuru99 {
	public static void main(String[] args) {

		String pin = "416003";
		String date = "31-12-2022";

		System.setProperty("webdriver.chrome.driver", "D:\\Rut's\\selenium-java-4.1.3\\Webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/V4/manager/addcustomerpage.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//a[normalize-space()='New Customer']")).click();

		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Ruturaj");
		driver.findElement(By.xpath("//input[@value='m']")).click();
		driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys("Kadamwadi");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Kolhapur");
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Maharastra");
		driver.findElement(By.xpath("//input[@name='telephoneno']")).sendKeys("8888545625");
		driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("rutu@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("8888");
		driver.findElement(By.xpath("//input[@name='pinno']")).sendKeys(pin);

		// date by send keys
		WebElement date1 = driver.findElement(By.xpath("//input[@id='dob']"));
		date1.sendKeys(date);
		// by JavaScript
		JavaScriptUtil.selectDateByJs(date1, driver, date);

		 driver.findElement(By.xpath("//input[@name='sub']")).click();
	}

}
