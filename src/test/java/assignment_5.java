import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Open below application
		 * https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
		 * 
		 * Capture the application url and verify url ends with “login”
		 * 
		 * Capture the application url and verify url contains “demo”
		 * 
		 * Capture the application title and verify title contains HRM
		 */

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		System.out.println(driver.getCurrentUrl()); // Capture the application url

		if (driver.getCurrentUrl().endsWith("login")) // verify url ends with “login”
		{

			System.out.println("The Url ends with login");
		}

		if (driver.getCurrentUrl().contains("demo")) {

			System.out.println("The URL contains Demo"); // verify url contains “demo”
		}

		System.out.println(driver.getTitle());// Capture the application title

		if (driver.getTitle().contains("HRM")) // verify title contains HRM
		{

			System.out.println("Title has HRM");
		}

		driver.close();
	}

}
