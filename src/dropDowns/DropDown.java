package dropDowns;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void selectOptionFromDropDown(WebElement ele,String value) {
		   
		   Select select=new Select(ele);
		   List<WebElement> options= select.getOptions();
		   for(WebElement e:options) {
			   if(e.getText().equalsIgnoreCase(value)) {
				   e.click();
				   break;
			   }
		   }
	   }

	public static void main(String[] args) {
		
	}

}
