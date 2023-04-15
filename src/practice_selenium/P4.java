package practice_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P4 {
	public static void main(String[] args) {
		String key="webdriver.chrome.driver";
		
		String value="C:\\Users\\ReNew\\Downloads\\chromedriver_win32\\chromedriver.exe";
		
		System.setProperty(key,value);
		
		WebDriver driver=new ChromeDriver();
		
		//checkbox
		driver.get("file:///C:/Users/ReNew/Desktop/SQL/wssa4.html");
		
		WebElement ele=driver.findElement(By.xpath("//input[@type='checkbox']"));
		ele.click();
		Boolean val=ele.isSelected();
		System.out.println(val);
		
		/*if(val)
		{
			System.out.println("Checkbox is Selected");
		}
		
		else
		{
			System.out.println("Checkbox is not Selected");
		}
		*/
	
		
	}

}
