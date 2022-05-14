package multipleWindows;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowsHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Rut's\\selenium-java-4.1.3\\Webdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//		String first=driver.getWindowHandle();
		//		System.out.println(first);

		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		
		Set<String> windows=driver.getWindowHandles();
		
		//to get Window id
			     Iterator<String> it= windows.iterator();
			     String firstWindow=it.next();
			     String secondWindow=it.next();
			     System.out.println(firstWindow);
			     System.out.println(secondWindow);
		    //to switch window
		//driver.switchTo().window(firstWindow);
		 driver.switchTo().window(secondWindow);
		 driver.findElement(By.xpath("//a[normalize-space()='Open Source HRMS']")).click();
		 Set<String> windows1=driver.getWindowHandles();
		//to get title of windows
		ArrayList<String> window=new ArrayList<String>(windows1);
		for(String id:window) {
			String title=driver.switchTo().window(id).getTitle();
			System.out.println(title);
		}
	
	
		Thread.sleep(3000);
		driver.quit();
	}
}
