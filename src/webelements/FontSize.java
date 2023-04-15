package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FontSize {
	public static void main(String[] args) {
		//key indicates specific type of browser
		String key="webdriver.chrome.driver";
		
		//value indicates path of the driver exefile
		String value="C:\\Users\\ReNew\\Downloads\\chromedriver_win32\\chromedriver.exe";
		
		//Specify the path of drivers to the server
		System.setProperty(key, value);
		
		//Launch Empty Chrome Browser
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		WebElement ele=driver.findElement(By.name("login"));
		String fontsize=ele.getCssValue("Font-Size");
		System.out.println(fontsize);
	}

}
