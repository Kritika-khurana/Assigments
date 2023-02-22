package assignment11;


import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testng_task {
	WebDriver driver;
	@Test(priority=1)
	public void startBrowser() {
		driver = new ChromeDriver();
		driver.get("https://ineuron-courses.vercel.app/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
	}
	@Test(priority=2)
	public void VerifyURL() {
		String url=driver.getCurrentUrl();
	Assert.assertTrue(url.contains("ineuron"));
	
		
	}
	@Test(priority=3)
	public void verifyTitle() {
		String Title =driver.getTitle();
		Assert.assertTrue(Title.contains("iNeuron"), "Title mismatched");
	}
	@Test(priority=4)
	public void ValidateFooterCount() {
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		List<WebElement> icons =driver.findElements(By.xpath("//div[@class='social-btns']/a"));
		icons.size();
		Assert.assertEquals(icons.size(), 4);
	}
	@Test(priority=5)
	public void Welcomemsg() {
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("ineuron@ineuron.ai");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("ineuron");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		WebElement msg=driver.findElement(By.xpath("//h4[@class='welcomeMessage']"));
		Assert.assertTrue(msg.isDisplayed(), "message not present");
		
		
		
	}
@Test(priority=6)
	public void Signintext() {
	driver.findElement(By.xpath("//button[text()='Sign out']")).click();
	WebElement text_Signin=driver.findElement(By.xpath("//h2[text()='Sign In']"));
	Assert.assertTrue(text_Signin.isDisplayed(), "Sign In text not present");
	
		
	}
@Test(priority=7)
public void teardown() {
	driver.quit();
}
}
