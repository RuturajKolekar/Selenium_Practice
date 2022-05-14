package dropDowns;

import java.util.List;

import org.openqa.selenium.WebElement;

public class Bootstrap {
	
	public static void selectOptionFromDropDown(List<WebElement> ele,String value) {
		   
		   
		   
		   for(WebElement e:ele) {
			   if(e.getText().equalsIgnoreCase(value)) {
				   e.click();
				   break;
			   }
		   }
	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
