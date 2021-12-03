package myPackage;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class Y_Assignment {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDownloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		// get no of links in webpage
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/"); // URL in the browser
		List<WebElement> lst = driver.findElements(By.cssSelector("input[type='checkbox']"));
		lst.get(0).click();
		String optn = lst.get(0).getText();

		Select s = new Select(driver.findElement(By.id("dropdown-class-example")));
		s.selectByValue(optn);

		driver.findElement(By.cssSelector("#name")).sendKeys(optn);
		driver.findElement(By.cssSelector("#alertbtn")).click();
		String alerttext = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		if (alerttext.contains(optn)) {
			System.out.println("Alert text contains option information correctly");
		}

	}

}