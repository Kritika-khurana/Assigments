package assignment11;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import assignment11.Utility;

public class DDT_practice {
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		driver=Utility.browser("chrome");
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	//@Test(dataProvider = "logindata")
	@Test
	public  void  login(String uname, String pwd) {
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		assignment11.ExcelReader.getDatafromsheet("Login");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
	}
	/*@DataProvider(name= "logindata")
		public Object[][] data() {
			Object [][] arr=new Object[2][2];
			arr[0][0]= "Admin";
			arr[0][1]= "admin123";
			arr[1][0]="kritika";
			arr[1][1]="test";
			return arr;
	}*/
			@AfterMethod()
			public void teardown() {
				driver.quit();
			}
			
		}
		
	


