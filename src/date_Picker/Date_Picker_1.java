package date_Picker;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date_Picker_1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Rut's\\selenium-java-4.1.3\\Webdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.redbus.in/");
		
		String year="2022";
		String month="july";
		String date="17";
		
		driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
		
		while(true) {
			String month_year=driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
			
			String arr[]=month_year.split(" ");
			String mo=arr[0];
			String yr=arr[1];
			
			if(mo.equalsIgnoreCase(month) && yr.equals(year)) 
				break;
			
			else
				driver.findElement(By.xpath("//button[normalize-space()='>']")).click();
				
			
		}
		
		List<WebElement> dates = driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//td"));
		
		for(WebElement ele: dates) {
			
			String dt=ele.getText();
			if(dt.equals(date)) {
				ele.click();
			}
		}

	}

}
