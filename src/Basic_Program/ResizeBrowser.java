package Basic_Program;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResizeBrowser {
	public static void main(String[] args) throws Throwable {
		//key indicates specific type of browser
				String key="webdriver.chrome.driver";
				
				//value indicates path of the driver exefile
				String value="C:\\Users\\ReNew\\Downloads\\chromedriver_win32\\chromedriver.exe";
				
				//Specify the path of drivers to the server
				System.setProperty(key, value);
				
				//Launch Empty Chrome Browser
				WebDriver driver=new ChromeDriver();
				driver.get("https:www.google.com");
				Thread.sleep(2000);
				Dimension d=new Dimension(100,200);
				driver.manage().window().setSize(d);
				
	}

}
