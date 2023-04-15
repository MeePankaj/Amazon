package practice_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P5 {
	public static void main(String[] args) {
String key="webdriver.chrome.driver";
		
		String value="C:\\Users\\ReNew\\Downloads\\chromedriver_win32\\chromedriver.exe";
		
		System.setProperty(key,value);
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/ReNew/Desktop/SQL/wssa4.html");
		
		WebElement ele=driver.findElement(By.xpath("//input[@type='password']"));
		Boolean val=ele.isDisplayed();
		System.out.println(val);
	}

}
