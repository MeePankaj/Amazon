package practice_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P8Gettext {
	public static void main(String[] args) {
		//keys
		String key="webdriver.chrome.driver";
		//value
		String valule="C:\\Users\\ReNew\\Downloads\\chromedriver_win32\\chromedriver.exe";
		//setProperty
		
		System.setProperty(key, valule);
		//Launch Browser by creating object
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		WebElement  ele=driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		
		String text=ele.getText();
		System.out.println(text);
		
		
		
	}

}
