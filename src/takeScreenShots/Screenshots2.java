package takeScreenShots;

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

public class Screenshots2 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\Rut's\\selenium-java-4.1.3\\Webdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//Full page ScreenShot
//		TakesScreenshot ts=(TakesScreenshot) driver;
//		File source = ts.getScreenshotAs(OutputType.FILE);
//		File trg =new File("D:\\Java Programs\\EclipsPrograms\\Selenium_Project\\screenshots\\test1.png");
//		FileUtils.copyFile(source, trg);
	
		//ScreenShot of Section
		/*
		WebElement section=driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		File src1 = section.getScreenshotAs(OutputType.FILE);
		File trg=new File(".\\screenshots\\FeaturedProduct.png");
		FileUtils.copyFile(src1, trg);
        */
		
		//ScreenShot of Single Element
		
		WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		File src=logo.getScreenshotAs(OutputType.FILE);
		File trg=new File(".\\screenshots\\Logo1.png");
		FileUtils.copyFile(src, trg);
		
		
		driver.quit();
	}

}
