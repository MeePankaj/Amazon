package practice_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1 {
	public static void main(String[] args) {
					
	//key and value by setProperty
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ReNew\\Downloads\\chromedriver_win32\\chromedriver.exe");
	//Launch 
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://www.google.com");
	
	
	
	
	

}
}
