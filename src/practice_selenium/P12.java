package practice_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P12 {
	public static void main(String[] args) {
				//key
				String key="webdriver.chrome.driver";
				//value
				String value="C:\\Users\\ReNew\\Downloads\\chromedriver_win32\\chromedriver.exe";
				//setProperty
				System.setProperty(key, value);
				//launch creating object
				WebDriver driver=new ChromeDriver();
				
				driver.get("https://www.flipkart.com");
				List<WebElement> ele = driver.findElements(By.xpath("//a"));
				int a = ele.size();
				System.out.println(a);
				
				for(WebElement element:ele)
				{
					
					System.out.println(element.getText());
				}
	}

}
