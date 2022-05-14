package webtables;
import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Rut's\\selenium-java-4.1.3\\Webdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/webtables");
		//Number of Rows & columns
		int rows=driver.findElements(By.xpath("//div[@role='rowgroup']")).size();
		int cols=driver.findElements(By.xpath("//div[@class='rt-tr']/child::div")).size();
		System.out.println("Total No of Rows:  "+rows);
		System.out.println("Total No of columns:  "+cols);
		
		//Find Specific Data From Table
		String value= driver.findElement(By.xpath("//div[@role='rowgroup'][1]//div[@class='rt-td'][1]")).getText();
        System.out.println("The value is:   "+value);
        
        //How To Get All Data
        for(int r=1;r<=3;r++) {
        	
                for(int c=1;c<=cols;c++) {
                	String data= driver.findElement(By.xpath("//div[@role='rowgroup']["+r+"]//div[@class='rt-td']["+c+"]")).getText();
                	System.out.print(data+"\t");
        	}
                System.out.println();
        }
        
        //for particular condition  (age & Salary of Cierra)
        for(int r=1;r<=rows;r++) {
        	String name= driver.findElement(By.xpath("//div[@role='rowgroup']["+r+"]//div[@class='rt-td'][1]")).getText();
        	if(name.equals("Cierra")) {
        		String age= driver.findElement(By.xpath("//div[@role='rowgroup']["+r+"]//div[@class='rt-td'][3]")).getText();
        		String salary=driver.findElement(By.xpath("//div[@role='rowgroup']["+r+"]//div[@class='rt-td'][5]")).getText();
        		System.out.println(name+"    "+age+"     "+salary);
        	}
        }
        
        //find column names
       List<WebElement> col_name= driver.findElements(By.xpath("//div[@class='rt-tr']/div"));
       for(WebElement e:col_name) {
    	   System.out.print(e.getText()+"\t");
       }
	}

}
