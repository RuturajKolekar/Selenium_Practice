package dropDowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownList {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Rut's\\selenium-java-4.1.3\\Webdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.orangehrm.com/hris-hr-software-demo/");
		
		WebElement drpcountry=driver.findElement(By.id("Form_submitForm_Country"));
		//Approach 1
		Select option=new Select(drpcountry);
		
//		option.selectByVisibleText("Brazil");
//		option.selectByValue("Bahamas");
//		option.selectByIndex(1);
		
		//Approach 2
		
		List<WebElement> options=option.getOptions();
		
		for(WebElement e:options) {
			if(e.getText().equals("Brazil")) {
				e.click();
				break;
			}
		}
		

	}

}
