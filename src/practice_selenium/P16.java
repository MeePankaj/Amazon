package practice_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P16 {
	public static void main(String[] args) {
		//key
		String key="webdriver.chrome.driver";
		//value
		String value="C:\\Users\\ReNew\\Downloads\\chromedriver_win32\\chromedriver.exe";
		//setProperty
		System.setProperty(key, value);
		//Launch browser creating object
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		List<WebElement> link = driver.findElements(By.tagName("a"));
		int count=link.size();
		System.out.println(count);
		
		for(WebElement a:link)
		{
			String b = a.getText();
			System.out.println(b);
		}
	}

}
