package dropDowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Rut's\\selenium-java-4.1.3\\Webdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://output.jsbin.com/osebed/2");
		
		
	     WebElement x=driver.findElement(By.id("fruits"));
		 
		Select select=new Select(x);
		List<WebElement> fruits=select.getOptions();
		System.out.println(fruits.size());
		
		for(WebElement ele:fruits) {
			System.out.println(ele.getText());
		}
		
//		for(WebElement element:fruits) {
//			element.click();
//        }
//		Thread.sleep(3000);
//		select.deselectAll();
//	
         
	
	}

}
