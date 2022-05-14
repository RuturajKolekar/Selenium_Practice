package locationAndSizeOfElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocationAndSize {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Rut's\\selenium-java-4.1.3\\Webdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		
		// size of Element
		WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		System.out.println("Width and height of Logo: "+logo.getSize());
		System.out.println("Width of Logo: "+logo.getSize().width);
		System.out.println("height of Logo: "+logo.getSize().height);
		
		System.out.println("Width of Logo: "+logo.getRect().width);
		System.out.println("height of Logo: "+logo.getRect().height);
		
		//location of element
		
		System.out.println("location(x,y)"+logo.getLocation());
		System.out.println("location(x)"+logo.getLocation().x);
		System.out.println("location(y)"+logo.getLocation().y);
		
		System.out.println("location(x)"+logo.getRect().getX());
		System.out.println("location(y)"+logo.getRect().getY());
		
		
	}

}
