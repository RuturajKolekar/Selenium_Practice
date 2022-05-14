package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Rut's\\selenium-java-4.1.3\\Webdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		
		driver.switchTo().frame("packageListFrame");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='org.openqa.selenium']")).click();
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("packageFrame");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='HasAuthentication']")).click();
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("classFrame");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Help']")).click();

	}

}
