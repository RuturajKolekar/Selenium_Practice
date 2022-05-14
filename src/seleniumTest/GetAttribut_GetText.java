package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribut_GetText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Rut's\\selenium-java-4.1.3\\Webdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://demo.nopcommerce.com/login");
		
		WebElement searchbox=driver.findElement(By.xpath("//input[@id='Email']"));
		searchbox.sendKeys("Ruturaj");
		System.out.println("getText(): "+searchbox.getText());
		System.out.println("GetAttribute: "+searchbox.getAttribute("value"));
		
		WebElement login=driver.findElement(By.xpath("//button[normalize-space()='Log in']"));
		System.out.println("getText(): "+login.getText());
		System.out.println("GetAttribute: "+login.getAttribute("class"));
		
		WebElement search=driver.findElement(By.xpath("//button[normalize-space()='Search']"));
		System.out.println("getText(): "+search.getText());

		WebElement text=driver.findElement(By.cssSelector("div[class='page-title'] h1"));
		System.out.println("getText(): "+text.getText());
		
		WebElement text1=driver.findElement(By.xpath("//div[@class='text']"));
		try {
		text1.clear();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		System.out.println("getText(): "+text1.getText().trim());
		
		
	}
	
}
