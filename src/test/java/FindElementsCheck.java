



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsCheck {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text() ='Create new account']")).click();
		Thread.sleep(3000);
		List<WebElement> list = driver.findElements(By.name("birthday_month"));
		Thread.sleep(3000);
		System.out.println(list.size());
		
	
	
		

	}

}
