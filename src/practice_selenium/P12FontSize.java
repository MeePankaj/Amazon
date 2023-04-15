package practice_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P12FontSize {
	public static void main(String[] args) {
		//key
		String key="webdriver.chrome.driver";
		//value
		String value="C:\\Users\\ReNew\\Downloads\\chromedriver_win32\\chromedriver.exe";
		//setProperty
		System.setProperty(key, value);
		//launch creating object
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		WebElement ele=driver.findElement(By.name("login"));
		String font=ele.getCssValue("font-size");
		System.out.println(font);
	}

}
