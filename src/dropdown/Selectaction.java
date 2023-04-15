package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectaction {
	public static void main(String[] args) {
		//key indicates type of browser
		String key="webdriver.chrome.driver";
		
		//value indicates path
		String value="C:\\Users\\ReNew\\Downloads\\chromedriver_win32\\chromedriver.exe";
		
		//set Property indicates path between driver and browser
		System.setProperty(key, value);
		
		//Launch Object has to be created
		WebDriver driver=new ChromeDriver();
		
		//Launchapp
		driver.get("file:///C:/Users/ReNew/Desktop/SQL/Dropdown.html");
		WebElement ele=driver.findElement(By.id("mtr"));
		
		Select s=new Select(ele);
		s.selectByIndex(0);
		s.selectByValue("m");
		s.selectByVisibleText("masaladosa");
		
		
		
	
		
		
	}

}
