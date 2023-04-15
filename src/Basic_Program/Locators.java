package Basic_Program;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class Locators {
	public static void main(String[] args) {
		//key indicates specific type of browser
		String key="webdriver.chrome.driver";
		
		//value indicates path of the driver exefile
		String value="C:\\Users\\ReNew\\Downloads\\chromedriver_win32\\chromedriver.exe";
		
		//Specify the path of drivers to the server
		System.setProperty(key, value);
		
		//Launch Empty Chrome Browser
		WebDriver driver=new ChromeDriver();
		
		//launch WebApp
		driver.get("file:///C:/Users/ReNew/Desktop/SQL/wssa4.html");
		
		//and perform click action
		driver.findElement(By.tagName("a")).click();

}
}
