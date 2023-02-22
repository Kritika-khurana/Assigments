	import java.time.Duration;
import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowssignmentiterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://ineuron-courses.vercel.app/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		String ParentWindow= driver.getWindowHandle();
		
		
		driver.findElement(By.xpath("//a[contains(@href,'youtube')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();
		
	Set<String>allhandles=driver.getWindowHandles();
	
Iterator<String> h = allhandles.iterator();
while(h.hasNext()) {
	

	System.out.println(driver.getTitle());
	
	driver.switchTo().window(h.next());
	
	if(driver.getTitle().contains("Twitter")) {
		System.out.println("title is " + driver.getTitle());
	
		
		break;
	}
	
	}
driver.switchTo().window( ParentWindow);
	}

	}


