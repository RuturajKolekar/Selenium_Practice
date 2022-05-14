package File_Upload;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import javaScriptExecutor.JavaScriptUtil;

public class Upload_File {

	public static void main(String[] args) throws AWTException {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver", "D:\\Rut's\\selenium-java-4.1.3\\Webdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		
		
		driver.get("https://www.monsterindia.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//a[@class='btn block resume-btn btn-orange mt20']")).click();
		
		//Upload File by SendKeys when Attribute type=file
		//driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("D:\\docs\\sample resume.pdf");
		
		
		//upload file by Robot class
		
		//click on uplod
		WebElement upload=driver.findElement(By.xpath("//input[@id='file-upload']"));
		JavaScriptUtil.clickByJS(upload, driver);
		
		Robot rb=new Robot();
		rb.delay(2000);
		
		//copy path to clip board
		StringSelection ss=new StringSelection("D:\\docs\\sample resume.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		//past the path CTRL+V
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		//Press Enter
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		

	}

}
