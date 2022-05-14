package dropDowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class BootstrapDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "D:\\Rut's\\selenium-java-4.1.3\\Webdrivers\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.navigate().to("https://getbootstrap.com/docs/4.5/components/dropdowns/");

		//Select Account Type
		driver.findElement(By.xpath("//button[@id='dropdownMenuButton']")).click();
		List<WebElement> option =driver.findElements(By.xpath("//div[@class='dropdown-menu show']/a"));
         Thread.sleep(1000);
		for(WebElement e:option) {
			if(e.getText().equalsIgnoreCase("action")) {
				e.click();
				break;
			}
		}
		driver.findElement(By.xpath("//a[@id='dropdownMenuLink']")).click();
		List<WebElement> option1=driver.findElements(By.xpath("//div[@class='dropdown-menu show']/a"));
		
		Thread.sleep(1000);
		for(WebElement h:option1){
			//System.out.println(h.getText());
			if(h.getText().equalsIgnoreCase("Another action")) {
				h.click();
				break;
			}
		}
		
		driver.findElement(By.cssSelector("button.btn.btn-primary.dropdown-toggle")).click();
		List<WebElement> option2=driver.findElements(By.xpath("//div[@class='dropdown-menu show']/a"));
		Bootstrap.selectOptionFromDropDown(option2, "separated link");
		
		
	}
}
