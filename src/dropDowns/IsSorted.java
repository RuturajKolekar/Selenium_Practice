package dropDowns;


import java.time.Duration;
import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsSorted {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "D:\\Rut's\\selenium-java-4.1.3\\Webdrivers\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.navigate().to("https://www.twoplugs.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
		
		driver.findElement(By.xpath("//a[normalize-space()='Live Posting']")).click();
		WebElement option=driver.findElement(By.name("category_id"));
		 Select select=new Select(option);
		 List<WebElement> list=select.getOptions();
	    ArrayList<String> original_list=new ArrayList<String>();
	    ArrayList<String> temp_list=new ArrayList<String>();

	    for(WebElement e:list) {
	    	original_list.add(e.getText());
	    	temp_list.add(e.getText());
	    }
	    System.out.println("original_list: "+original_list);
	    System.out.println("temp_list: "+temp_list);
	    
	    Collections.sort(temp_list);
	    System.out.println("original_list: "+original_list);
	    System.out.println("temp_list: "+temp_list);
	    
	    if(original_list.equals(temp_list)) {
	    	System.out.println("DropDown is Sorted");
	    }
	    else {
	    	System.out.println("DropDown is Unsorted");
	    }
	}

}
