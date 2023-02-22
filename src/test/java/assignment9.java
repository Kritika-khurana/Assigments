import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignment9 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ineuron-courses.vercel.app/login");

		driver.findElement(By.xpath("//a[@href='/signup']")).click();
		Thread.sleep(2000);
		System.out.println((driver.findElement(By.xpath("//button[@type='submit']")).isEnabled()));

		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("kritika");
		driver.findElement(By.name("email")).sendKeys("kritikakhurana2010@gmail.com");
		driver.findElement(By.name("password")).sendKeys("test@1234");
		driver.findElement(By.xpath("//label[text()='Testing']//preceding-sibling::input")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0,400)");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@value='Female']")).click();
		WebElement i1 = driver.findElement(By.id("state"));
		Select s1 = new Select(i1);
		s1.selectByValue("Haryana");

		System.out.println((driver.findElement(By.xpath("//button[@type='submit']")).isEnabled()));
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("kritikakhurana2010@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("test@1234");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

}
