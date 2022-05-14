package seleniumTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsDiff {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Rut's\\selenium-java-4.1.3\\Webdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.nopcommerce.com");
		
		//find single Element
		List<WebElement> searchbox=driver.findElements(By.cssSelector("input#small-searchterms"));
		int size=searchbox.size();
		System.out.println(size);
		
		//find multiple elements
		List<WebElement> links=driver.findElements(By.xpath("//div[@class='footer-upper']//a"));
		System.out.println(links.size());
		for(WebElement e:links) {
			System.out.println(e.getText());
		}

	}

}
