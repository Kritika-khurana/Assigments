import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class createpage_automate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//a[text() ='Create new account']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Amyra");
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("khera");
	driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("12345678");
	driver.findElement(By.xpath("//input[contains(@id,'passw')]")).sendKeys("122esa");
	WebElement mon=driver.findElement(By.xpath("//select[@id='month']"));
	Select s = new Select(mon);
s.selectByValue("8");
WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
Select s1 = new Select(day);
s1.selectByValue("22");
WebElement yr=driver.findElement(By.xpath("//select[@id='year']"));
Select s2 = new Select(yr);
s2.selectByVisibleText("2021");
driver.findElement(By.xpath("//div[normalize-space()='Gender']/following::input[1]")).click();
driver.findElement(By.xpath("//button[@name='websubmit']")).click();


	}

}
