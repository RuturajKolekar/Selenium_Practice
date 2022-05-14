package alerts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authenticated_popup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Rut's\\selenium-java-4.1.3\\Webdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//https://username:pass@Url
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
	}

}
