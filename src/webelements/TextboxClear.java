package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextboxClear {
	public static void main(String[] args) throws Throwable {
		//key indicates specific type of browser
				String key="webdriver.chrome.driver";
				
				//value indicates path of the driver exefile
				String value="C:\\Users\\ReNew\\Downloads\\chromedriver_win32\\chromedriver.exe";
				
				//Specify the path of drivers to the server
				System.setProperty(key, value);
				
				//Launch Empty Chrome Browser
				WebDriver driver=new ChromeDriver();
				
				// Launch ap
				
				driver.get("file:///C:/Users/ReNew/Desktop/SQL/wssa4.html");
				WebElement ele=driver.findElement(By.xpath("//input[@type='text']"));
				ele.clear();
				Thread.sleep(2000);
				ele.sendKeys("cat");
				

}
}
