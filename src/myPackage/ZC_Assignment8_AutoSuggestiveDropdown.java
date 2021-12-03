package myPackage;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class ZC_Assignment8_AutoSuggestiveDropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDownloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/"); // URL in the browser
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Ind");
		Thread.sleep(3000);
		Actions act = new Actions(driver);

		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] div"));
		System.out.println(options.size());

		for (int i = 0; i < options.size(); i++) {
			if (options.get(i).getText().equalsIgnoreCase("INDIA")) {
				act.moveToElement(options.get(i)).click().build().perform();
				break;
			}
		}
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//input[@id='autocomplete']")).getAttribute("value"));

	}

}
