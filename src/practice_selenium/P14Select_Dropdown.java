package practice_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class P14Select_Dropdown {
	public static void main(String[] args) {
		//key
		String key="webdriver.chrome.driver";
		//value
		String value="C:\\Users\\ReNew\\Downloads\\chromedriver_win32\\chromedriver.exe";
		//setProperty
		System.setProperty(key, value);
		//Launch Browser creating Object
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/ReNew/Desktop/SQL/Dropdown.html");
		WebElement ele = driver.findElement(By.id("mtr"));
		Select s=new Select(ele);
		s.selectByVisibleText("vada");
		
	}

}
