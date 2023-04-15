package Basic_Program;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchEmptyChromeBrowser {
	public static void main(String[] args) {
		//key indicates specific type of browser
		String key="webdriver.chrome.driver";
		
		//value indicates path of the driver exefile
		String value="C:\\Users\\ReNew\\Downloads\\chromedriver.exe";
		
		//Specify the path of drivers to the server
		System.setProperty(key, value);
		
		//Launch Empty Chrome Browser
		ChromeDriver driver=new ChromeDriver();
		
		//driver.close();
		//driver.quit();
		
	}

}
