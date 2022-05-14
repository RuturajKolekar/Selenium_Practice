package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Rut's\\selenium-java-4.1.3\\Webdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		/*
		//Single Button
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Alert a1=driver.switchTo().alert();
		System.out.println(a1.getText());
		Thread.sleep(3000);
		a1.accept();
		*/
		
		/*
		//Two Buttons
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Alert a2=driver.switchTo().alert();
		Thread.sleep(3000);
		a2.accept();
		a2.dismiss();
		*/
		
		//button With text field
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Alert a3=driver.switchTo().alert();
		System.out.println(a3.getText());
		Thread.sleep(3000);
		a3.sendKeys("Hi It's Ruturaj");
		Thread.sleep(3000);
		a3.accept();
	}

}
