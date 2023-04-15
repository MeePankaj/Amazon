package practice_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P9EnterAction {
	public static void main(String[] args) {
		//key
		String key="webdriver.chrome.driver";
		//value
		String value="C:\\Users\\ReNew\\Downloads\\chromedriver_win32\\chromedriver.exe";
		//setProperty
		System.setProperty(key, value);
		//Launch browser by creating object
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		
	}

}
