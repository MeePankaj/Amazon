package practice_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P13HandingMultipleElements {
	public static void main(String[] args) {
		//key
		String key="webdriver.chrome.driver";
		//value
		String value="C:\\Users\\ReNew\\Downloads\\chromedriver_win32\\chromedriver.exe";
		//setProperty
		System.setProperty(key, value);
		//Launch Browser by creating Object
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		List<WebElement> link = driver.findElements(By.tagName("a"));
		int a = link.size();
		System.out.println(a);
		
		for(WebElement b:link)
		{
			System.out.println(b.getText());
		}
		
	}

}
