package Basic_Program;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class BroserActions {
	public static void main(String[] args) {
		//key indicates specific type of browser
		String key="webdriver.chrome.driver";
		
		//value indicates path of the driver exefile
		String value="C:\\Users\\ReNew\\Downloads\\chromedriver_win32\\chromedriver.exe";
		
		//Specify the path of drivers to the server
		System.setProperty(key, value);
		
		//Launch Empty Chrome Browser
		WebDriver driver=new ChromeDriver();
		
		//launch webApp
		driver.get("https://www.facebook.com/");
		
		//get title 
		String title=driver.getTitle();
		System.out.println(title);
		
		//page source
		String page=driver.getPageSource();
		System.out.println(page);
		
		//get current url
		String currenturl=driver.getCurrentUrl();
		System.out.println(currenturl);
}
}
