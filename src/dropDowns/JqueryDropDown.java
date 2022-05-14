package dropDowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class JqueryDropDown extends JqureyDropD {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "D:\\Rut's\\selenium-java-4.1.3\\Webdrivers\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.navigate().to("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));

		driver.findElement(By.id("justAnInputBox")).click();

		List<WebElement> choice=driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
	     selectOptionFromDropDown(choice, "all");
	    //selectOptionFromDropDown(choice, "all");
		
	}
	
	public static void selectOptionFromDropDown(List<WebElement> ele,String... value) {
		if(!value[0].equalsIgnoreCase("all")) {
			   for(WebElement choice:ele) {
				   String option=choice.getText();
				   for(String match:value) {
					   if(match.equals(option)) {
						   choice.click();
						   break;
					   }
				   }
			   }
		}
		else {
			for(WebElement choice:ele) {
				choice.click();
			}
		}
	}
}


