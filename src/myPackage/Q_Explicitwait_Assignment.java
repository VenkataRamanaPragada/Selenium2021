package myPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Q_Explicitwait_Assignment {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDownloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.itgeared.com/demo/1506-ajax-loading.html"); // URL in the browser
		driver.findElement(By.xpath("//a[text()='Click to load get data via Ajax!']")).click();
		// Explicit wait
		WebDriverWait w = new WebDriverWait(driver, 10);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results")));

		String resultsMessage = driver.findElement(By.cssSelector("#results")).getText();
		System.out.println(resultsMessage);
		// driver.close();
	}

}