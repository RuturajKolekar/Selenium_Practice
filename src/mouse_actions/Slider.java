package mouse_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Rut's\\selenium-java-4.1.3\\Webdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		
		WebElement min_slider=driver.findElement(By.xpath("//span[1]"));
		System.out.println("Location: "+min_slider.getLocation());
		
		Actions act=new Actions(driver);
		act.dragAndDropBy(min_slider, 100, 0).perform();
		System.out.println("Location: "+min_slider.getLocation());
		
		WebElement max_slider=driver.findElement(By.xpath("//span[2]"));
		System.out.println("Location: "+max_slider.getLocation());
		act.dragAndDropBy(max_slider, -80, 0).perform();
		System.out.println("Location: "+max_slider.getLocation());
		
		
	}

}
