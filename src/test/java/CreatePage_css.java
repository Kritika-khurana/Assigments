import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreatePage_css {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//a[text() ='Create new account']")).click();
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Amyra");
	driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("khera");
	driver.findElement(By.cssSelector("input[name='reg_email__']")).sendKeys("12345678");
	driver.findElement(By.cssSelector("input[id*=	'passw']")).sendKeys("122esa");
	WebElement mon=driver.findElement(By.cssSelector("select[id='month']"));
	Select s = new Select(mon);
s.selectByValue("8");
WebElement day=driver.findElement(By.cssSelector("select[id='day']"));
Select s1 = new Select(day);
s1.selectByValue("22");
WebElement yr=driver.findElement(By.cssSelector("select[id='year']"));
Select s2 = new Select(yr);
s2.selectByVisibleText("2021");
//driver.findElement(By.cssSelector("#u_7_4_Wp")).click();
driver.findElement(By.cssSelector("#reg_form_box input[value='1']")).click();

driver.findElement(By.cssSelector("button[name='websubmit']")).click();


	//#reg_form_box input:nth-of-type(8)

	}

}
