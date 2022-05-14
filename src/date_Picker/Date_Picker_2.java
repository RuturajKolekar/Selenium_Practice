package date_Picker;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Date_Picker_2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Rut's\\selenium-java-4.1.3\\Webdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		
		driver.findElement(By.xpath("//input[@id='dob']")).click();
		
		WebElement month=driver.findElement(By.xpath("//select[@aria-label='Select month']"));
		Select mnth=new Select(month);
		mnth.selectByVisibleText("Jul");
		
		WebElement year=driver.findElement(By.xpath("//select[@aria-label='Select year']"));
		Select yr=new Select(year);
		yr.selectByVisibleText("2022");
		
		List<WebElement> dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr/td"));
		for(WebElement ele:dates) {
			String dt=ele.getText();
			String date="17";
			if(dt.equals(date)) {
				ele.click();
			}
			
		}
	}

}
