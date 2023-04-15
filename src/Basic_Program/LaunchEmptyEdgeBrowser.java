package Basic_Program;

import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEmptyEdgeBrowser {
	public static void main(String[] args) {
		
		String key="webdriver.edge.driver";
		String value="C:\\Users\\ReNew\\Downloads\\edgedriver_win64\\msedgedriver.exe";
		System.setProperty(key, value);
		EdgeDriver driver=new EdgeDriver();
		
		driver.close();
		
	}

}
