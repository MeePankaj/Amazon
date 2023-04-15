package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextboxSelect {
	public static void main(String[] args) {
		//key indicates specific type of browser
				String key="webdriver.chrome.driver";
				
				//value indicates path of the driver exefile
				String value="C:\\Users\\ReNew\\Downloads\\chromedriver_win32\\chromedriver.exe";
				
				//Specify the path of drivers to the server
				System.setProperty(key, value);
				
				//Launch Empty Chrome Browser
				WebDriver driver=new ChromeDriver();
				
				// Launch app
				
				driver.get("file:///C:/Users/ReNew/Desktop/SQL/wssa4.html");
				WebElement ele=driver.findElement(By.name("//input[@type='checkbox']"));
				ele.click();
				boolean val=ele.isSelected();
				System.out.println(val);
				if(val) {
					System.out.println("checkbox is Select");
					
				}
				else
				{
					System.out.println("checkbox is not Select");
				}
				

	}
}
