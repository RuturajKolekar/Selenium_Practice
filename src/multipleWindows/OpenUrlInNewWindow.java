package multipleWindows;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenUrlInNewWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Rut's\\selenium-java-4.1.3\\Webdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();

		String id1=driver.getWindowHandle();

		//open Url in new Tab
		//driver.switchTo().newWindow(WindowType.TAB);

		//open Url in new Window
		Thread.sleep(3000);
		driver.switchTo().newWindow(WindowType.WINDOW);
	

		driver.get("https://www.opencart.com/");

		String id2=driver.getWindowHandle();
		System.out.println(id1);
		System.out.println(id2);
		Thread.sleep(3000);
		driver.switchTo().window(id1);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.switchTo().window(id2);
		driver.navigate().refresh();


	}

}
