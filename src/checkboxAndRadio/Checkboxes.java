package checkboxAndRadio;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Rut's\\selenium-java-4.1.3\\Webdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Single Check box
		//driver.findElement(By.id("monday")).click();
		
	//	List<WebElement> days=driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
		//Multiple check box
//		
//		for(WebElement e:days) {
//			String day=e.getAttribute("id");
//			if(day.equalsIgnoreCase("sunday")||day.equalsIgnoreCase("monday")||day.equalsIgnoreCase("friday")) {
//				e.click();
//			}
//		}
//		Thread.sleep(3000);
//		//All check boxes
//		for(WebElement e:days) {
//			e.click();
//		}
//		
		List<WebElement> days = driver.findElements(By.xpath("//div[@class='form-check']//input"));
		int total_days=days.size();
		
		for(int i=2;i<total_days;i++) {
			String day=days.get(i).getAttribute("id");
			System.out.println(day);
			if(day.equalsIgnoreCase("friday")) {
				days.get(i).click();
				break;
			}
		}
		
		
	}

}
