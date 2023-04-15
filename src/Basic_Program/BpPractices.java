package Basic_Program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BpPractices {
	public static void main(String[] args) {
		//key indecates type of browser
		String key="webdriver.chrome.driver";
		
		//value indecates path 
		String value="C:\\Users\\ReNew\\Downloads\\chromedriver_win32\\chromedriver.exe";
		
		//set Property identifies path between driver and browser
		System.setProperty(key, value);
		
		//Launch creat object
		WebDriver driver=new ChromeDriver();
		
		//Navigate webdriver
		driver.navigate().to("https://www.google.com/");
		//driver.get("https://www.google.com/");
		
		//Capture Title of webpage
		System.out.println("Title:"+driver.getTitle());
		
		//Capture Url of webpage
		System.out.println("URL:"+driver.getCurrentUrl());
		
		//Capture PageSource of webPage
		//System.out.println("Page:"+driver.getPageSource());
		
		driver.findElement(By.tagName("a")).click();
	}
}
