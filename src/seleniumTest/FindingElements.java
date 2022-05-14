package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingElements {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Rut's\\selenium-java-4.1.3\\Webdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://stackoverflow.com/users/login");
		
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("ruturajkolekar56@gmail.com");
		
		WebElement Pass=driver.findElement(By.name("password"));
		Pass.sendKeys("ruturaj@#123987");
		
		//css selector using tag & id#
		driver.findElement(By.cssSelector("button#submit-button")).click();
		
		Thread.sleep(2000);
		
		//css selector using tag & Attribute[]
		WebElement searchBox=driver.findElement(By.cssSelector("input[name='q']"));
		searchBox.sendKeys("selenium");
		searchBox.sendKeys(Keys.ENTER);
		
		//css selector using tag & class .
		driver.findElement(By.cssSelector("svg.svg-icon.iconStackExchange")).click();
		
		//css selector using tag , class . & attribute []
		driver.findElement(By.cssSelector("a.js-gps-track[href='https://stackoverflow.com/users/logout']")).click();
		driver.findElement(By.linkText("stackexchange.com")).click();
		driver.findElement(By.partialLinkText("sites")).click();
		
		//driver.findElement(By.cssSelector("input.s-checkbox")).click();
		
		//driver.findElement(By.linkText("Log out"));
		
		//by Xpath
		//driver.findElement(By.xpath("//*[@id=\"content\"]/div/form/div[2]/button")).click();
		
		//by css selector
		//driver.findElement(By.cssSelector("#content > div > form > div.d-flex.gs4 > button")).click();
		
		
		
		
		

	}

}
