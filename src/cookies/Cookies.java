package cookies;



import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Rut's\\selenium-java-4.1.3\\Webdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.nopcommerce.com/");
		
		//capture cookies from browser
		Set<Cookie> cookie_set = driver.manage().getCookies();
		System.out.println("cookie size: "+cookie_set.size());
		
		//to print cookies details
		/*for(Cookie cookie:cookie_set) {
	        System.out.println(cookie.getDomain());
	        System.out.println(cookie.getName());
	        System.out.println(cookie.getPath());
	        System.out.println(cookie.getSameSite());
	        System.out.println(cookie.getValue());
		}*/
		
		
		//add cookie to browser
		Cookie cookiobj=new Cookie("MyCookie", "6555");
		driver.manage().addCookie(cookiobj);
		 cookie_set = driver.manage().getCookies();
		System.out.println("cookie size after adding: "+cookie_set.size());
		
		//delete Specific cookie
		
		//driver.manage().deleteCookieNamed("MyCookie");//by cookie name
		driver.manage().deleteCookie(cookiobj);//by cookie obj
		cookie_set = driver.manage().getCookies();
		System.out.println("cookie size after deleting: "+cookie_set.size());
		
		
		//delete all cookies
		driver.manage().deleteAllCookies();
		cookie_set = driver.manage().getCookies();
		System.out.println("cookie size after deleting all: "+cookie_set.size());
		
		
        driver.quit();
	}

}
