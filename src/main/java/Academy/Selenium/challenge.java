package Academy.Selenium;

import java.util.List;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class challenge {
	public static List<WebElement> regions;
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://petdiseasealerts.org/forecast-map#/");
		driver.switchTo().frame(0);
		regions=driver.findElements(By.cssSelector("#regions g path"));
		System.out.println(regions.size());
		//Region("New York");
		//driver.switchTo().frame(1);
		Thread.sleep(3000);
		Region_A("Connecticut");
		
	
		}
	public static void Region_A(String Region) {
		
		for(int i =0;i<regions.size();i++) 
		{
			
			System.out.println(regions.get(i).getAttribute("name"));
			String r= regions.get(i).getAttribute("name");
			
			if(r.equalsIgnoreCase(Region)) 
					
					{
				 regions.get(i).click();

				//WebElement f= regions.get(i);
				//JavascriptExecutor js = (JavascriptExecutor)driver;
				//js.executeScript("arguments[0].click()",Region);
				break;
			} 
				
				
			}
			
			//driver.quit();
				
			
		
			
			
		}
			
		
		
		
		
	}
		
		
		
		
		
		
		

	


