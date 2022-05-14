package downloadFile;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Download_File {

	public static void main(String[] args) {
		
		String location=System.getProperty("user.dir")+"\\downloads\\";
		
		//For Fire fox
		FirefoxProfile profile=new FirefoxProfile();
		profile.setPreference("pdfjs.disabled", true);
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/pdf");
		profile.setPreference("browser.download.folderList", 2);
		profile.setPreference("browser.download.dir", location);
		
		FirefoxOptions options=new FirefoxOptions();
		options.setProfile(profile);
		
		System.setProperty("webdriver.gecko.driver", "D:\\Rut's\\selenium-java-4.1.3\\Webdrivers\\Driver_Notes\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(options);
		
		
		//for Chrome Browser  <---> Same for Edge Browser
		/*HashMap<String, Comparable> prefrance=new HashMap();
		prefrance.put("download.default_directory", location);
		prefrance.put("plugins.always_open_pdf_externally", true);
		
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("prefs", prefrance);
		
		System.setProperty("webdriver.chrome.driver", "D:\\Rut's\\selenium-java-4.1.3\\Webdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);*/
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.get("https://file-examples.com/index.php/sample-documents-download/sample-doc-download/");
		//driver.findElement(By.xpath("//tbody/tr[1]/td[5]/a[1]")).click();
		driver.get("https://file-examples.com/index.php/sample-documents-download/sample-pdf-download/");
		driver.findElement(By.xpath("//tbody/tr[1]/td[5]/a[1]")).click();
	}

}
