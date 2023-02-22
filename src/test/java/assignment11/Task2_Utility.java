package assignment11;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.netty.util.Timeout;


public class Task2_Utility {
	WebDriverWait wait;
	
		public static void captureScreenshotOfWebElement(WebDriver driver,WebElement element) {
			TakesScreenshot ts = (TakesScreenshot)element;
		File src=ts.getScreenshotAs(OutputType.FILE);
	try {
		FileHandler.copy(src, new File("./Screenshot/"+ "Screenshot1"+CurrentDateTime()+".png"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

		
		
			
}

		public static String CurrentDateTime() {
			
			
			SimpleDateFormat s = new SimpleDateFormat("HH_mm_ss_dd_MM_yyyy");
			String date =s.format(new Date());
			return date;
			
			
			
			
			
		}
		
}
