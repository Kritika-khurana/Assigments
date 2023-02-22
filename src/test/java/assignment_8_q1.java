import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment_8_q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String msg=driver.findElement(By.xpath("//h2[text()='Connect with friends and the world around you on Facebook.']")).getText();
		System.out.println(msg);
		if(msg.equals("Connect with friends and the world around you on Facebook.")) {
			System.out.println("message is correct");
		}
		
		driver.quit();
	}

}
