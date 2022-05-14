package mouse_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Rut's\\selenium-java-4.1.3\\Webdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
		WebElement drag1=driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement drag2=driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		WebElement drag3=driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
		WebElement drag4=driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));
		
		WebElement target1=driver.findElement(By.xpath("//div[@id='trash']"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(drag1, target1).perform();
		Thread.sleep(2000);
		act.dragAndDrop(drag2, target1).perform();
		Thread.sleep(2000);
		act.dragAndDrop(drag3, target1).perform();
		Thread.sleep(2000);
		act.dragAndDrop(drag4, target1).perform();
		
		
	}

}
