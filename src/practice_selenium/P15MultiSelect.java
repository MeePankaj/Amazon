package practice_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class P15MultiSelect {
	public static void main(String[] args)throws Throwable {
		//key
		String key="webdriver.chrome.driver";
		//value
		String value="C:\\Users\\ReNew\\Downloads\\chromedriver_win32\\chromedriver.exe";
		//setProperty
		System.setProperty(key, value);
		//Launch Browser by creating Object
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/ReNew/Desktop/SQL/Dropdown.html");
		WebElement ele = driver.findElement(By.id("nadanapalace"));
		//ele.sendKeys(Keys.CONTROL+"a");
		
		Select s=new Select(ele);
		s.selectByIndex(0);
		s.selectByIndex(2);
		Thread.sleep(2000);
		s.deselectAll();
		
		
	}

}
