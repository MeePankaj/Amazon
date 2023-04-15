package practice_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P10Attribute {
	public static void main(String[] args) {
				//key
				String key="webdriver.chrome.driver";
				//value
				String value="C:\\Users\\ReNew\\Downloads\\chromedriver_win32\\chromedriver.exe";
				//setProperty
				System.setProperty(key, value);
				//Launch browser by creating object
				WebDriver driver=new ChromeDriver();
				
				driver.get("https://www.facebook.com/");
				WebElement text=driver.findElement(By.name("email"));
				String ele=text.getAttribute("name");
				System.out.println(ele);
				
	}

}
