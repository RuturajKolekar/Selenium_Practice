package dropDowns;

import java.util.List;

import org.openqa.selenium.WebElement;

public class JqureyDropD {
	
	 
	public static void selectOptionFromDropDown(List<WebElement> ele,  String... value) {
		
		if(!value[0].equalsIgnoreCase("all")) {
			for(WebElement choice:ele) {
			String	Coption= choice.getText();

				for(String Soption:value) {
					if(Coption.equals(Soption)) {
						choice.click();
						break;
					}
				}
			}
		}
		 else {
			 for(WebElement choice1:ele ) {
				 choice1.click();
			 }
		 }
		
	}

	public static void main(String[] args) {
		

	}

}
