package checkboxAndRadio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Rut's\\selenium-java-4.1.3\\Webdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.guru99.com/test/radio.html");
		
		WebElement button1=driver.findElement(By.cssSelector("input#vfb-7-1"));
		WebElement button2=driver.findElement(By.cssSelector("input#vfb-7-2"));
		WebElement button3=driver.findElement(By.cssSelector("input#vfb-7-3"));
		
		System.out.println(button1.isDisplayed());
		System.out.println(button2.isDisplayed());
		System.out.println(button3.isDisplayed());
		
		System.out.println("-------------------------------");
		
		System.out.println(button1.isEnabled());
		System.out.println(button2.isEnabled());
		System.out.println(button3.isEnabled());
		
		System.out.println("-------------------------------");
		
		button1.click();
		System.out.println(button1.isSelected());
		System.out.println(button2.isSelected());
		System.out.println(button3.isSelected());
		
		System.out.println("-------------------------------");
		
		button2.click();
		System.out.println(button1.isSelected());
		System.out.println(button2.isSelected());
		System.out.println(button3.isSelected());
		
		System.out.println("-------------------------------");
	
		button3.click();
		System.out.println(button1.isSelected());
		System.out.println(button2.isSelected());
		System.out.println(button3.isSelected());
		
		

	}

}
