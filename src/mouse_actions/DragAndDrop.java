package mouse_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Rut's\\selenium-java-4.1.3\\Webdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.seleniumeasy.com/drag-and-drop-demo.html");
		
		WebElement drag1=driver.findElement(By.xpath("//span[normalize-space()='Draggable 1']"));
		WebElement drag2=driver.findElement(By.xpath("//span[normalize-space()='Draggable 2']"));
		WebElement drag3=driver.findElement(By.xpath("//span[normalize-space()='Draggable 3']"));
		WebElement drag4=driver.findElement(By.xpath("//span[normalize-space()='Draggable 4']"));
		
		driver.findElement(By.id("mydropzone")).click();
		
//		Actions act=new Actions(driver);
//		act.dragAndDrop(drag1, target1).perform();
//		act.dragAndDrop(drag2, target1).perform();
//		act.dragAndDrop(drag3, target1).perform();
//		act.dragAndDrop(drag4, target1).perform();
		
	}

}
