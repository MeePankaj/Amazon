package practice_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3 {
	public static void main(String[] args) {
			
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ReNew\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.saucedemo.com/");
	
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	driver.findElement(By.name("password")).sendKeys("secret_sauce");
	
	//WebElement cl=driver.findElement(By.xpath("//a[text()='LOGIN']"));
	//cl.sendKeys(Keys.ENTER);
	
	driver.findElement(By.className("submit-button")).click();
	
	int count=driver.findElements(By.partialLinkText("Sauce")).size();
	System.out.println("Element:"+count);
	
	WebElement ele=driver.findElement(By.linkText("Sauce Labs Bolt T-Shirt"));
	ele.sendKeys(Keys.ENTER);
	

	
	

}
}	
/* 1>By id() 
  2>By name()
  3>By className()
  4>By tagName()
  5>By linkText()
  6>By partialLinkText() 
  7> By cssSelector()
  8>By xPath()
 */