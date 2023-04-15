package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllOptions {
	public static void main(String[] args)throws Throwable {
		//key indicates type of browser
		String key="webdriver.chrome.driver";
		
		//value indicates path
		String value="C:\\Users\\ReNew\\Downloads\\chromedriver_win32\\chromedriver.exe";
		
		//set Property indicates path between driver and browser
		System.setProperty(key, value);
		
		//Launch Object has to be created
		WebDriver driver=new ChromeDriver();
		//Launchapp
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[.='Create new account']")).click();
		
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.id("month"));
		
		Select s=new Select(ele);
		List<WebElement> option=s.getOptions();
		int count=option.size();
		System.out.println(count);
		
		/*for(WebElement a:option)
		{
			System.out.println(a.getText());
		}
		*/
		
		
		
		
	}

}
