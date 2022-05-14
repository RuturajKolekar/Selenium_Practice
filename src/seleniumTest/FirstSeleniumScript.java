package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumScript {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Rut's\\selenium-java-4.1.3\\Webdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		//<-----Getting The Title of the Website----->
		
		driver.get("https://www.selenium.dev");
		String title=driver.getTitle();
		if("Selenium".equals(title)) {
			System.out.println("The title of webSite is Matched. Test Pass: "+title);
		}
		else {
			System.out.println("The title of webSite is Not Matched. Test Failed: "+title);
		}
		
		String pagesource=driver.getPageSource();
		System.out.println(pagesource);
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		WebElement searchBox=driver.findElement(By.xpath("//input[@placeholder=' Search this site…']"));
		
		System.out.println(searchBox.isDisplayed());
        
		

	}

}
