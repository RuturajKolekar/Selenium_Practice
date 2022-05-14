package javaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtil {
	
	public static void flash(WebElement element,WebDriver driver) {
		
		String bgcolor=element.getCssValue("backgroundColor");
		for(int i=0;i<10;i++) {
			changeColor("rgb(0,200,0)", element, driver);
			changeColor(bgcolor, element, driver);
		}
	}
	public static void changeColor(String color,WebElement element,WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.backgroundColor ='"+color+"'", element);
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {	
		}
	}
	
	public static void drawBorderByJS(WebElement element,WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border='3px solid red'", element);
	}
	
	public static void getAlertByJS(WebDriver driver,String message) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("alert('"+message+"')");
	}
	
	public static void scrollDownByJS(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	public static void scrollUpByJS(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
	}
	
	public static void scrollIntoView(WebDriver driver,WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeAsyncScript("arguments[0].scrollIntoView(true);", element);
	}
	
	public static void zoompageByJS(WebDriver driver,String percentage) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("document.body.style.zoom='"+percentage+"'");
	}
	
	public static String getTitleByJS(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		String title=js.executeScript("return document.title;").toString();
		return title;
	}
	public static String getInnerTextByJS(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		String pageText=js.executeScript("return document.documentElement.innerText;").toString();
		return pageText;
	}
	
	public static void refreshByJS(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("history.go(0)");
	}
	
	public static void clickByJS(WebElement element,WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}
	
	public static void selectDateByJs(WebElement element,WebDriver driver,String datevalue) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','"+datevalue+"');", element);
	}

}
