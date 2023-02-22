package assignment11;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task_4 {
	WebDriver driver;

	public static void waitForElement(WebDriver driver, By locator, int timeout) throws InterruptedException {

		for (int i = 0; i < timeout; i++) {

			try {

				driver.findElement(locator).click();
				driver.switchTo().alert();

			} catch (NoAlertPresentException a) {
				System.out.println("No Such ALert");
				Thread.sleep(1000);
				driver.findElement(locator).click();

			} catch (UnhandledAlertException e) {
				System.out.println("got the alert");
				driver.switchTo().alert().accept();
				System.out.println("accepted the alert");
			}

		}

	}

}
