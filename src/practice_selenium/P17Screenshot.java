package practice_selenium;



import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class P17Screenshot {
	public static void main(String[] args) throws IOException   {
		//key
		String key="webdriver.chrome.driver";
		//value
		String value="C:\\Users\\ReNew\\Downloads\\chromedriver_win32\\chromedriver.exe";
		//Setproperty
		System.setProperty(key, value);
		//Launch Browser
		WebDriver driver=new ChromeDriver();
		//launch App
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		File f=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		Files.copy(f,new File("C:\\Users\\ReNew\\Desktop\\img\\Fb.jpg"));
		

	}

}
