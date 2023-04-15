package webelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WPractices {
	public static void main(String[] args) {
		//key and value are setProperty
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ReNew\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		//Launch Create Object
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.className("submit-button")).click();
		
		//holdpage current window
		String currentwindow=driver.getWindowHandle();
		driver.switchTo().window(currentwindow);
		
		//driver.findElement(By.linkText("Sauce Labs Bolt T-Shirt"));
		
		List<WebElement> elementlist=driver.findElements(By.partialLinkText("Sauce"));
		System.out.println("Element:"+elementlist.size());
		
		
		
		

	}

}
