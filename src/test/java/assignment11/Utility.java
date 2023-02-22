package assignment11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Utility {
	
	
	public static WebDriver browser(String browser) {
		WebDriver driver=null;
		if(browser.equals("chrome")) {
		driver = new ChromeDriver();
			
		}
		
		else if(browser.equals("Edge")){
		 driver = new EdgeDriver();
		}
		return driver;
		
					
		}

	

}
