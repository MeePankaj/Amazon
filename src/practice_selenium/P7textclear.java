package practice_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P7textclear {
	public static void main(String[] args) throws Throwable {
	String key="webdriver.chrome.driver";
		
		String value="C:\\Users\\ReNew\\Downloads\\chromedriver_win32\\chromedriver.exe";
		
		System.setProperty(key,value);
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/ReNew/Desktop/SQL/wssa4.html");
		
		WebElement ele=driver.findElement(By.xpath("//input[@type='text']"));
		Thread.sleep(3000);
		ele.sendKeys(Keys.CONTROL+"a");
		ele.sendKeys(Keys.DELETE);
		ele.sendKeys("Pankaj");
		
		WebElement en=driver.findElement(By.xpath("//a[text()='Google']"));
		en.sendKeys(Keys.ENTER);
		
	}

}
