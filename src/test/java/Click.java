import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://login.yahoo.com/");
WebElement Element=driver.findElement(By.id("persistent"));
JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("arguments[0].click()", Element);


	}

}
