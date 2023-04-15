package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAlloption {
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
		//driver.get("https://www.facebook.com/");
		//driver.findElement(By.xpath("//a[.='Create new account']"));
		driver.get("file:///C:/Users/ReNew/Desktop/SQL/Dropdown.html");
		WebElement ele=driver.findElement(By.id("nadanapalace"));
		
		
		
		Select s=new Select(ele);
		List<WebElement> option=s.getOptions();
		int count=option.size();
		
		for(int i=0; i<count; i++) {
			s.selectByIndex(i);
		}
		//s.deselectAll();
	}

}
