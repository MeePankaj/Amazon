package webelements;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleMultipleElement {
	public static void main(String[] args) {
		
		//key indicates type of browser
			String key="webdriver.chrome.driver";
			
			//value indicates path
			String value="C:\\Users\\ReNew\\Downloads\\chromedriver_win32\\chromedriver.exe";
			
			//set Property indicates path between driver and browser
			System.setProperty(key, value);
			
			//Launch Object has to be created
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.flipkart.com/");
			List<WebElement> link=driver.findElements(By.tagName("a"));
			int size=link.size();
			System.out.println(size);
			
			for(WebElement a: link) {
				String text=a.getText();
				System.out.println(text);
				
			}

}
}
