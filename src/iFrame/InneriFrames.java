package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class InneriFrames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Rut's\\selenium-java-4.1.3\\Webdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/nestedframes");
		WebElement outer=driver.findElement(By.xpath("//iframe[@id='frame1']"));
		driver.switchTo().frame(outer);
		
		WebElement inner=driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
		driver.switchTo().frame(inner);
		WebElement innertext=driver.findElement(By.xpath("//p[text()='Child Iframe']"));
		
		System.out.println(innertext.getText());
		driver.switchTo().parentFrame();
		WebElement outertext=driver.findElement(By.xpath("//body"));
		System.out.println(outertext.getText());
		
		driver.switchTo().defaultContent();
	

	}

}
