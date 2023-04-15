package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterAction {
	public static void main(String[] args) {
		//key indicates type of browser
		String key="webdriver.chrome.driver";
		
		//value indicates path
		String value="C:\\Users\\ReNew\\Downloads\\chromedriver_win32\\chromedriver.exe";
		
		//set Property indicates path between driver and browser
		System.setProperty(key, value);
		
		//Launch Object has to be created
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/ReNew/Desktop/SQL/wssa4.html");
		WebElement ele=driver.findElement(By.xpath("//a[.='Google']"));
		ele.sendKeys(Keys.ENTER);

}
}
