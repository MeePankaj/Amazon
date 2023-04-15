package practice_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2 {
	public static void main(String[] args) {
		//key and value
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ReNew\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//launch by creating object
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		//maximize 
		driver.manage().window().maximize();
		//to know Element (userName)
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		//to know Element (Password)
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		//login button
		driver.findElement(By.className("submit-button")).click();
		
		//Enter Action
		driver.findElement(By.linkText("Sauce Labs Bike Light")).sendKeys(Keys.ENTER);
		
		
		
		
		
	
		
		
	}

}
