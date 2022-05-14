package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Locators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Rut's\\selenium-java-4.1.3\\Webdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		driver.findElement(By.name("firstname")).sendKeys("Ruturaj");
		//driver.findElement(By.name("lastname")).sendKeys("Kolekar");
		driver.findElement(By.cssSelector("[name=\"lastname\"]")).sendKeys("Kolekar");
        driver.findElement(By.id("sex-0")).click();
        driver.findElement(By.xpath("//*[@id=\"exp-2\"]")).click();
        driver.findElement(By.cssSelector("#datepicker")).sendKeys("08-04-2022");
        driver.findElement(By.cssSelector("#profession-1")).click();
        driver.findElement(By.id("tool-0")).click();
        driver.findElement(By.id("tool-1")).click();
        driver.findElement(By.id("tool-2")).click();
        
        Select select=new Select(driver.findElement(By.className("input-xlarge")));
        select.selectByVisibleText("South America");
        
        driver.findElement(By.linkText("Click here to Download File"));
      //  driver.findElement(By.partialLinkText("Click here to"));
        
  
	}

}
