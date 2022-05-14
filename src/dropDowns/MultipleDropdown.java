package dropDowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleDropdown extends DropDown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Rut's\\selenium-java-4.1.3\\Webdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.orangehrm.com/hris-hr-software-demo/");

		WebElement drpcountry=driver.findElement(By.id("Form_submitForm_Country"));
		DropDown.selectOptionFromDropDown(drpcountry, "pakistan");
	}

}
