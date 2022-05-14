package dropDowns;

import java.time.Duration;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Rut's\\selenium-java-4.1.3\\Webdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.name("q")).sendKeys("selenium");

		List<WebElement> list=driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='wM6W7d']"));
		System.out.println(list.size());
//		for(WebElement e:list) {
//			if(e.getText().equals("selenium automation testing")) {
//				e.click();
//				break;
//			}
		
		List<WebElement> list1=driver.findElements(By.xpath("//div[@class='wM6W7d']/span/parent::div"));
		for(WebElement e1:list1) {
			System.out.println(e1.getText());
		}
             }
		}
	


