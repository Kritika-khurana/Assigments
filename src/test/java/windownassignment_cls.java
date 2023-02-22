import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windownassignment_cls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://ineuron-courses.vercel.app/login");
		driver.manage().window().maximize();
		String ParentWindow= driver.getWindowHandle();
		
		driver.findElement(By.xpath("//a[contains(@href,'youtube')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();
		
	Set<String>allhandles=driver.getWindowHandles();
	
List<String>ar = new ArrayList<String>(allhandles);
System.out.println(ar.size());


for(int i =0;i<ar.size();i++)
{
	
     
	driver.switchTo().window(ar.get(i));
	System.out.println(driver.getTitle());

                 if(driver.getTitle().contains("Twitter")) 
                  {
                	
	                  System.out.println(driver.getTitle());
	               
           
                	  break;

                  }   
               
                  }	
                
driver.switchTo().window(ParentWindow);
		
		
	}

}
