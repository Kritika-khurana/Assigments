import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment8_q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		List<WebElement> li = driver.findElements(By.xpath("//div[@id='pageFooterChildren']/ul/li"));
		System.out.println(li.size());
		for (int i = 0; i < li.size(); i++) {
			if (li.get(i).getText().equals("Create Page")) {
				li.get(i).click();
				break;
			}
		}
		driver.close();
	}

}
