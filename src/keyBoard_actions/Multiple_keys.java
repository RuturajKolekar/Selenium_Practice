package keyBoard_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Multiple_keys {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Rut's\\selenium-java-4.1.3\\Webdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://text-compare.com/");
		
		WebElement input_text1=driver.findElement(By.xpath("//textarea[@id='inputText1']"));
		WebElement input_text2=driver.findElement(By.xpath("//textarea[@id='inputText2']"));
		
		input_text1.sendKeys("It's Not Difficult For Me ('_')");
		Thread.sleep(3000);
		//CTRL + A
		Actions act=new Actions(driver);
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		act.perform();
		Thread.sleep(3000);
		
		//CTRL+C
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		
		//tab to shift to input box2
		act.sendKeys(Keys.TAB);
		act.perform();
		Thread.sleep(3000);
		
		//CTRL+v
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		if(input_text1.getAttribute("value").equals(input_text2.getAttribute("value")))
			System.out.println("Text is Copied");
		else
			System.out.println("Text is not copied!!");

	}

}
