package assignment11;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task_1 extends Task2_Utility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		WebElement element = driver.findElement(By.xpath("//button[@onclick='timedText()']"));
		captureScreenshotOfWebElement(driver, element);

		driver.findElement(By.xpath("//button[@onclick='timedText()']")).click();

		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(20));

		// condition1
		wt.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath("//p[@id='demo']")),
				"WebDriver"));

		// condition2
		// By locator= By.xpath("//p[@id='demo']");
		// wt.until(ExpectedConditions.textToBe(locator, "WebDriver"));

		driver.quit();

	}

}
