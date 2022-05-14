package webtables;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_WebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Rut's\\selenium-java-4.1.3\\Webdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.opencart.com/admin/index.php");
		
		WebElement username = driver.findElement(By.name("username"));
		username.clear();
		username.sendKeys("demo");
		
		WebElement pass = driver.findElement(By.name("password"));
		pass.clear();
		pass.sendKeys("demo");
		
		driver.findElement(By.xpath("//button")).click();
		
		driver.findElement(By.xpath("//a[normalize-space()='Sales']")).click();
		
		driver.findElement(By.xpath("//a[normalize-space()='Orders']")).click();
		
		//finding total no.of pages
		
		String text=driver.findElement(By.xpath("//div[@class='col-sm-6 text-right']")).getText();
        System.out.println(text);
        
        int total_pages=Integer.valueOf(text.substring(text.indexOf("(")+1, text.indexOf("Pages")-1));
        System.out.println(total_pages);
        
        for(int i=1;i<=5;i++) {
        	String active_page=driver.findElement(By.xpath("//ul[@class='pagination']/li/span")).getText();
        	//System.out.println(active_page);
        	if(active_page.equals("5")) {
        		List<WebElement> customers=driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']/tbody/tr/td[3]"));
        		for(WebElement ele:customers) {
        		     System.out.println(ele.getText());
        		}
        		break;
        	}
        	int rows=driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']/tbody/tr")).size();
        	//System.out.println("Total number of Rows: "+rows);
        	String pageno=Integer.toString(i+1);
        	driver.findElement(By.xpath("//ul[@class='pagination']//li/a[text()='"+pageno+"']")).click();
        	
        }
        		
	}

}
