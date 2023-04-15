package practice_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P11Location {
	public static void main(String[] args) {
		//key
		String key="webdriver.chrome.driver";
		//value
		String value="C:\\Users\\ReNew\\Downloads\\chromedriver_win32\\chromedriver.exe";
		//setProperty
		System.setProperty(key, value);
		//Launch creating object
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		WebElement ele=driver.findElement(By.name("email"));
		Point loc=ele.getLocation();
		int x=loc.getX();
		int y=loc.getY();
		System.out.println(x);
		System.out.println(y);
	}

}
