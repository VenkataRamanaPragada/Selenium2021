package myPackage;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class ZA_WebTableAssignment {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDownloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/"); // URL in the browser

		int colcount = driver.findElements(By.xpath("//table[@name='courses']/tbody/tr/th")).size();
		int rowcount = driver.findElements(By.xpath("//table[@name='courses']/tbody/tr")).size();
		System.out.println("Columns count: " + colcount);
		System.out.println("Rows count: " + rowcount);
		for (int i = 1; i <= colcount; i++) {
			String xpath = "//table[@name='courses']/tbody/tr[3]/td[" + i + "]";
			System.out.println(driver.findElement(By.xpath(xpath)).getText());
		}

	}

}








