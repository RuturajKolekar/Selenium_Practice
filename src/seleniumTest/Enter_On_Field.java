 package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enter_On_Field {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Rut's\\selenium-java-4.1.3\\Webdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.airbnb.co.in");
		WebElement location=driver.findElement(By.className("_1yibeas"));
		location.sendKeys("Kolhapur",Keys.ENTER);
		driver.findElement(By.className("_f8btejl")).click();
		driver.findElement(By.className("_59t1ky")).click();

	}

}
