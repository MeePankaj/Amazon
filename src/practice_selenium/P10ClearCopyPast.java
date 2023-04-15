package practice_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P10ClearCopyPast {
	public static void main(String[] args) {
		//key
		String key="webdriver.chrome.driver";
		//value
		String value="C:\\Users\\ReNew\\Downloads\\chromedriver_win32\\chromedriver.exe";
		//setProperty
		System.setProperty(key, value);
		//Launch by creating object
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/ReNew/Desktop/SQL/wssa4.html");
		WebElement e1=driver.findElement(By.xpath("//input[@type='text']"));
		e1.sendKeys(Keys.CONTROL+"a");
		e1.sendKeys(Keys.CONTROL+"c");
		WebElement e2=driver.findElement(By.xpath("//input[@type='password']"));
		e2.sendKeys(Keys.CONTROL+"v");
		
	}

}
