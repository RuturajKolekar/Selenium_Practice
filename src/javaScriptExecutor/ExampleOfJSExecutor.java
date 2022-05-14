package javaScriptExecutor;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleOfJSExecutor {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Rut's\\selenium-java-4.1.3\\Webdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
		
		//Flash the Element
			WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
			JavaScriptUtil.flash(logo, driver);
			Thread.sleep(3000);
		
		//Draw Border 
			JavaScriptUtil.drawBorderByJS(logo, driver);
			Thread.sleep(3000);
		/*
		TakesScreenshot ts=(TakesScreenshot) driver;
			File src=ts.getScreenshotAs(OutputType.FILE);
			File trg=new File(".\\screenshots\\HighlightedLogo.png");
			FileUtils.copyFile(src,trg);
		*/
		
		//Generate Alert by JS
			JavaScriptUtil.getAlertByJS(driver, "There is Error in Logo");
			Thread.sleep(3000);
			driver.switchTo().alert().accept();
			Thread.sleep(3000);
		
		//Scroll down by JS
			JavaScriptUtil.scrollDownByJS(driver);
			Thread.sleep(3000);
			//scroll up by JS
			JavaScriptUtil.scrollUpByJS(driver);
			Thread.sleep(3000);
		
		//scroll into view by JS
			WebElement featured_products=driver.findElement(By.xpath("//strong[normalize-space()='Featured products']"));
//			JavaScriptUtil.scrollIntoView(driver, featured_products);
//			Thread.sleep(3000);
			
			
			
		
		//get title by JS
			//System.out.println(JavaScriptUtil.getTitleByJS(driver));
			
		//get inner Text Of Page
			//System.out.println(JavaScriptUtil.getInnerTextByJS(driver));
			
	    //zoom page by JS
			JavaScriptUtil.zoompageByJS(driver,"50%");
			Thread.sleep(3000);
			
		//refresh page by JS
			
			JavaScriptUtil.refreshByJS(driver);
			Thread.sleep(3000);
		//click by JS
			WebElement register=driver.findElement(By.xpath("//a[@class='ico-register']"));
			JavaScriptUtil.clickByJS(register, driver);
			
			
		
		
	}

}
